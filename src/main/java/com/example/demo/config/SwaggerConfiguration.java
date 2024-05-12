package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {

    @Bean
    OpenAPI customOpenApi(@Value("${spring.application.name}") String applicationName,
            @Value("${spring.application.version}") String applicationVersion) {
        return new OpenAPI().info(new Info().title(applicationName).description("Demo Application")
                .version(applicationVersion));
    }
}
