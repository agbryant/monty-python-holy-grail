package com.agbryant.montypythonholygrail;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.agbryant.montypythonholygrail")
public class MontyPythonHolyGrailApplication {


	public static void main(String[] args) {
		SpringApplication.run(MontyPythonHolyGrailApplication.class, args);
	}

}
