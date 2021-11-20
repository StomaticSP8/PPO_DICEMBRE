package com.example.PPO_Dicembre;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@ComponentScan("com.example.PPO_Dicembre_controller")
public class PpoDicembreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpoDicembreApplication.class, args);
	}

}
