package br.edu.iftm.tspi.acessar_dados_mysql;

import org.springframework.boot.SpringApplication;

public class TestAcessarDadosMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(AcessarDadosMysqlApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
