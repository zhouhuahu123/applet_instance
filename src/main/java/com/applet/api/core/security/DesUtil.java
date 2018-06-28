package com.applet.api.core.security;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

/**
 * @author zhouhuahu on 2018/6/26.
 */
public final class DesUtil {
	private static final String DEFAULT_PASSWORD_CRYPT_KEY = "__jDlog_";

	private static final String DES = "DES";
	private static Cipher cipher = null;

	static {
		// Cipher����ʵ����ɼ��ܲ���
		try {
			cipher = Cipher.getInstance(DES);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private DesUtil() {

	}

	public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
		// DES�㷨Ҫ����һ�������ε������Դ
		SecureRandom sr = new SecureRandom();

		// ��ԭʼ�ܳ���ݴ���DESKeySpec����
		DESKeySpec dks = new DESKeySpec(key);

		// ����һ���ܳ׹�����Ȼ�������DESKeySpecת����
		// һ��SecretKey����
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);

		// ���ܳ׳�ʼ��Cipher����
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

		// ��ʽִ�м��ܲ���
		return cipher.doFinal(src);
	}

	public static byte[] decrypt(byte[] src, byte[] key) throws Exception {

		// DES�㷨Ҫ����һ�������ε������Դ
		SecureRandom sr = new SecureRandom();

		// ��ԭʼ�ܳ���ݴ���һ��DESKeySpec����
		DESKeySpec dks = new DESKeySpec(key);

		// ����һ���ܳ׹�����Ȼ�������DESKeySpec����ת����
		// һ��SecretKey����
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);

		// ���ܳ׳�ʼ��Cipher����
		cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

		// ��ʽִ�н��ܲ���
		return cipher.doFinal(src);
	}

	public static String decrypt(String data) {
		try {
			return new String(decrypt(hex2byte(data.getBytes()),
					DEFAULT_PASSWORD_CRYPT_KEY.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
		return null;
	}

	public static String decrypt(String data, String key) {
		try {
			return new String(
					decrypt(hex2byte(data.getBytes()), key.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
		return null;
	}

	public static String encrypt(String data) {
		try {
			return byte2hex(encrypt(data.getBytes(),
					DEFAULT_PASSWORD_CRYPT_KEY.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String encrypt(String data, String key) {
		try {
			return byte2hex(encrypt(data.getBytes(), key.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
		return null;
	}

	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";

		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs = hs + "0" + stmp;
			} else {
				hs = hs + stmp;
			}
		}

		return hs.toUpperCase();
	}

	public static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0) {
			throw new IllegalArgumentException("���Ȳ���ż��");
		}

		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}

		return b2;
	}

}