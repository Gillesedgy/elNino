package com.example.elNino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ElNinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElNinoApplication.class, args);
	}

}
