package br.edu.iftm.tspi.acessar_dados_jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AcessarDadosJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AcessarDadosJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AcessarDadosJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClienteRepository repository){
		return (args) -> {
			repository.save(new Cliente("Jack", "Bauer"));
			repository.save(new Cliente("Chloe", "O'Brian"));
			repository.save(new Cliente("Kim", "Bauer"));
			repository.save(new Cliente("David", "Palmer"));
			repository.save(new Cliente("Michelle", "Dessler"));

			log.info("Clientes encontrados com findAll():");
			log.info("-----------------------------------");
			repository.findAll().forEach(cliente -> {
				log.info(cliente.toString());
			});
			log.info("");

			log.info("Clientes encontrados com findBySobreNome('Bauer'):");
			log.info("--------------------------------------------------");
			repository.findBySobreNome("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
		};
	}
}
