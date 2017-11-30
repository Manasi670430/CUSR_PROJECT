package edu.sjsu.cmpe275.termproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Cmpe275TermProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cmpe275TermProjectApplication.class, args);
	}
}
