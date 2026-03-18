package org.botnicholas.projects.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
//we don't add @Configuration here, so we need to use @EnableConfigurationProperties on the configuration class
@ConfigurationProperties(prefix = "greeter")
public class GreeterProperties {
    private boolean enabled = true;
    private String prefix = "Hello";
}
