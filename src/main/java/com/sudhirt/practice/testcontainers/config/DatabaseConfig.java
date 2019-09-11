package com.sudhirt.practice.testcontainers.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.sudhirt.practice.testcontainers.repository")
public class DatabaseConfig {
}