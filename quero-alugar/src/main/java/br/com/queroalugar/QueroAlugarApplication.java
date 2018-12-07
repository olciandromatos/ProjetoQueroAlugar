package br.com.queroalugar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(value = "br.com.queroalugar.domain")
public class QueroAlugarApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueroAlugarApplication.class, args);
	}
}
