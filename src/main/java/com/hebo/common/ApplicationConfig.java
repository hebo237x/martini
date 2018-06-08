package com.hebo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hebo on 2018/5/31.
 */
@Configuration
public class ApplicationConfig {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationConfig.class);

    public void test(){
        LOG.info("test tag");
    }

}
