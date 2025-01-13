package br.com.alura.CoffeAPI;

import br.com.alura.CoffeAPI.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoffeApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
