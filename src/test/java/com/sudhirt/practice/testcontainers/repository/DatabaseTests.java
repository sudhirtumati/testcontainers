package com.sudhirt.practice.testcontainers.repository;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.OracleContainer;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(initializers = { DatabaseTests.Initializer.class })
public class DatabaseTests {

    @ClassRule
    public static OracleContainer oracleContainer = new OracleContainer();

    @Test
    public void contextLoads() {
        
    }

    static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
		@Override
		public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
			TestPropertyValues
					.of("spring.datasource.url=" + oracleContainer.getJdbcUrl(),
							"spring.datasource.username=" + oracleContainer.getUsername(),
							"spring.datasource.password=" + oracleContainer.getPassword())
					.applyTo(configurableApplicationContext.getEnvironment());
		}
	}
    
}