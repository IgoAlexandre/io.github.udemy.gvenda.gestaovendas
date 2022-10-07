package io.github.udemy.gvenda.gestaovendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"io.github.udemy.gvenda.gestaovendas.domain.entity"})
@EnableJpaRepositories(basePackages = {"io.github.udemy.gvenda.gestaovendas.domain.repository"})
@ComponentScan(basePackages = {"io.github.udemy.gvenda.gestaovendas.rest.controller", "io.github.udemy.gvenda.gestaovendas.service"})
@SpringBootApplication
public class GestaoVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoVendasApplication.class, args);
	}

}
