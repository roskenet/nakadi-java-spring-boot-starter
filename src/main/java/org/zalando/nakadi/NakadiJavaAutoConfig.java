package org.zalando.nakadi;

import nakadi.NakadiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NakadiJavaAutoConfig {

    @Bean
    public NakadiClient nakadiClient() {
        var builder = NakadiClient.newBuilder();
        builder.baseURI("http://localhost:8080");

        return builder.build();
    }
}

