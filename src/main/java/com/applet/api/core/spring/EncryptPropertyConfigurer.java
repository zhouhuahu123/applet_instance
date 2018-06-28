package com.applet.api.core.spring;

import com.alibaba.druid.util.HexBin;
import com.applet.api.core.constants.PUBConstants;
import com.applet.api.core.security.Cryptos;
import com.applet.api.core.security.RSAUtils;
import jodd.util.Base64;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Properties文件加载前的解密
 * @author zhouhuahu on 2018/6/26.
 */
public class EncryptPropertyConfigurer extends PropertyPlaceholderConfigurer {

    private static final String private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIvJ9M1cuwvdhwzHWZEnGTIYt7Lfkw0dZi2CFEhGE0eHAP+zWWTJBUM7Sd7GGmyFSxAyCVPcbdjULVW86LxzliQaXOPtUi5wz+nZ05w/amqVZRuxeKTtoC2hW7d6jDXmaKo8UtL9HjdEIgxjZriiXNHvtYy+uMkEtcHjmL0l0o9VAgMBAAECgYBj5myg5wh1rld5dm44Ie0LtEZz+vuof74p/7BnBk147K52DsJwGIk+Rvy/zGvN6mR+qoOn/vwx3VCY2WyqYSCGlbxqUZqM8di/8Sgw19eBcszj1bX0xtJ/lMxqyHniY6A+0txdxLxAIq2VLIjr40BZQYIE3raH5w4KksDZCinhgQJBAMkUoqSnzUljN737Ag5umB5TKmt+FoyT0vnUCQ7AY0T2xeMuPH1n8gtfnzdZuZFd33Vp44EsrwU1r4aXL0BZuykCQQCx99zPVxDIEYl0PVannP4zkIosMR0qXx3EsioZIGWnkvrfXhXkQFVzR1uEQjW5aMklQBqqFMGSwyl3/SOUV6RNAkAWUjcXxhTQv7XRXgrFZVt3ik3cLtv78PDrkLEMtSiP4EDpThmi5iYFQzEeaNRjoaMLmpyJm1c2YdZBP4kcQJm5AkEAloDVxKaNs5RZGOtSoBb9RqBCqZKzZoTfyNsfDPa/4RJEhKetfcUGPqIm+9d+VZkPGih3JES/Wx0esbFq6GWhtQJAcTx5GQj8RzvLnKLVSd/Kmfds8GYa6NXddPAnBEd07Rvu25AYOio2/ioyS8qVS7DgZ6jBb1vdOO+6ufT2Uio4gA==";

    private static Properties prop;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
            throws BeansException {
        EncryptPropertyConfigurer.prop = props;
        super.processProperties(beanFactoryToProcess, props);
    }

    protected void processPropertiesBak(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
            throws BeansException {
        try {
            if (props.getProperty("runtime").equalsIgnoreCase("pro")) {
                Map<String, String> rev = new HashMap<String, String>();
                for (Object o : props.keySet()) {
                    String key = (String) o;
                    String value = props.getProperty(key);
                    String ekey = Cryptos.aesDecrypt(HexBin.decode(key), PUBConstants.DEFAULT_AES_KEY.getBytes());
                    String enc = Base64.decodeToString(RSAUtils.decryptByPrivateKey(Base64.decode(value), private_key));
                    rev.put(ekey, enc);
                }
                props.clear();
                props.putAll(rev);
                EncryptPropertyConfigurer.prop = props;
            } else {
                EncryptPropertyConfigurer.prop = props;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.processProperties(beanFactoryToProcess, props);
    }

    public static Properties getProperties() {
        return prop;
    }
}