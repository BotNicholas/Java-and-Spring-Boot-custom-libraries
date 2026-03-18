package org.botnicholas.projects.config;

import lombok.extern.slf4j.Slf4j;
import org.botnicholas.projects.Greeter;
import org.botnicholas.projects.config.properties.GreeterProperties;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
@AutoConfiguration
@ConditionalOnClass(Greeter.class) //This configuration will be created only when this class is present in the classpath
@EnableConfigurationProperties(GreeterProperties.class) //registering the configuration properties, since that object doesn't have the @Configuration annotation
@ConditionalOnProperty(prefix = "greeter", name = "enabled", havingValue = "true", matchIfMissing = true) //With this greeter.enabled property we can disable this configuration
public class GreeterAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter(final GreeterProperties properties) {
        log.info("Creating Greater!!!");
        return new Greeter(properties.getPrefix());
    }
}
