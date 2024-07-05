package br.edu.iftm.tspi.acessar_dados_mysql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AcessarDadosMysqlApplicationTests {

	@Test
	void contextLoads() {
	}

}
