package com.example.cotroladordeestoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ControladorDeEstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControladorDeEstoqueApplication.class, args);
	}

}
