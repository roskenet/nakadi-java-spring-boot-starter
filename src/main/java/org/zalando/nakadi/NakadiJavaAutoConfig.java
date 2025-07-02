package org.zalando.nakadi;

import nakadi.NakadiClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(NakadiProperties.class)
public class NakadiJavaAutoConfig {

    private final NakadiProperties properties;

    public NakadiJavaAutoConfig(NakadiProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public NakadiClient nakadiClient() {
        var builder = NakadiClient.newBuilder();

        builder.baseURI(properties.getBaseURI());

        return builder.build();
    }
}
