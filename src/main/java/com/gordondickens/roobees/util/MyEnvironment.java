package com.gordondickens.roobees.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.StandardEnvironment;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * User: gordondickens
 * Date: 2/23/12
 * Time: 8:36 AM
 */
public class MyEnvironment {
    private static final Logger logger = LoggerFactory.getLogger(MyEnvironment.class);
    @Value("#{ systemProperties['user.language'] }")
    private String varOne;

    @Value("#{ systemProperties }")
    private Properties systemProperties;

    @Value("#{ systemEnvironment }")
    private Properties systemEnvironment;

    @Value("#{ environment }")
    private StandardEnvironment environment;

    @Override
    public String toString() {
        return "\n\n********************** MyEnvironment: ["
                + "\n\tsystemProperties=" + formatMe(systemProperties.toString())
                + ", \n\n\tsystemEnvironment=" + formatMe(systemEnvironment.toString())
                + ", \n\n\tenvironment=" + formatMe(environment.toString()) + "]";
    }

    private static final String formatMe(String in) {
        String out = in;
        out = in.replace("{", "{\n\t\t");
        out = out.replace(", ", "\n\t\t");

        return out;
    }


    @PostConstruct
    public void afterInstantiation() {
        logger.debug(this.toString());
    }

//    public String toReflectiveString() {
//        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
//    }
}