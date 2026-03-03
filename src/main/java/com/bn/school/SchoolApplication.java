package com.bn.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//marcar a classe principal da aplicação
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

    //para entrar no banco de dados deve-se utilizar a url localhost:8080
    // caso a porta 8080 esteja sendo usada, vá até application.properties e digite server.port = (numero desejado)
}
