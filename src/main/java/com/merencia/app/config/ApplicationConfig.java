package com.merencia.app.config;

import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.merencia.app.repositories")
@EntityScan("com.merencia.app.entities")
@EnableTransactionManagement
public class ApplicationConfig {
	
	@Bean
	@Profile("tests")
	public DataSource dataSource() {
		/* Configure HSQL datasource for tests */
		return new EmbeddedDatabaseBuilder()
				.setType( EmbeddedDatabaseType.HSQL )
				.build();
	}

}
