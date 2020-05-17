package com.dong.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties( prefix = "dong.hello")
public class HelloPropeties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
