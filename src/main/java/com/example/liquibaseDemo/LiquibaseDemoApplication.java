package com.example.liquibaseDemo;

import com.example.liquibaseDemo.repository.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiquibaseDemoApplication {

	private static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(LiquibaseDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository) {
		return (args) -> personRepository.findAll().forEach(person ->
				log.info("{} {}", person.getId(), person.getName())
		);
	}
}
