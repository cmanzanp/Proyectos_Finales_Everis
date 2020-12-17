package com.everis.taskmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.everis.taskmanager.model.EverisUser;
import com.everis.taskmanager.model.EverisUserRange;
import com.everis.taskmanager.services.EverisUserService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.everis.taskmanager.model", "com.everis.taskmanager.repository",
		"com.everis.taskmanager.services", "com.everis.taskmanager.services_impl",
		"com.everis.taskmanager.controller" })
@EntityScan(basePackages = { "com.everis.taskmanager.model" })
@EnableJpaRepositories(basePackages = { "com.everis.taskmanager.repository", "com.everis.taskmanager.controller",
		"com.everis.taskmanager.services_impl" })

public class TaskManagerApplication  {

	@Autowired
	EverisUserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
