package br.com.dio.projetopatternspringboot.gft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot criado via Spring Initializr.
 * Usando as seguintes dependencias:
 *  - Spring Data JPA;
 *  - Spring Web;
 *  - H2 DataBase;
 *  - OpenFeign.
 *
 *  - Para ver se a aplicação esta funcionando no Swegger é dar inicio ao Spring Boot executandoa classe principal
 *   - e digita o seguinte endereço no browser: 128.0.01:8080/swegger-ui.html
 *
 * @author paulo
 */

@EnableFeignClients  // Anotação adicionado para que o projeto saiba que ele vai usar o Feign.
@SpringBootApplication // Esta Anotação já esta presente ao criar esta Clase padrão.
public class ProjetoPatternSpringDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPatternSpringDioApplication.class, args);
	}

}
