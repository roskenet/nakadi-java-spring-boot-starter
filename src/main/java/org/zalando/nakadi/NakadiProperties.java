package org.zalando.nakadi;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "nakadi")
public class NakadiProperties {

    private String baseURI;

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(final String baseURI) {
        this.baseURI = baseURI;
    }

}
