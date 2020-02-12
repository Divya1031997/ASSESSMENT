package com.cts.springbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages="com.cts.springbootjpa.*")
//@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactory", basePackages="com.cts.*")
	public class SpringBootDataJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpa1Application.class, args);
	}

}
