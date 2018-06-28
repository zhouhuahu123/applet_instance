package com.applet.api.core.comm;

import com.applet.api.core.spring.JdbcTemplateFix;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
public abstract class CommonService {
    @Autowired
    protected JdbcTemplateFix jdbcTemplate;
}
