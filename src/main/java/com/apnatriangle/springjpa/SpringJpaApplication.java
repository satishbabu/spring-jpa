package com.apnatriangle.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	private TradeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		repository.save(new Trade("t11", "b1"));
		repository.save(new Trade("t12", "b1"));
		repository.save(new Trade("t21", "b2"));

		System.out.println("\n**FindAll");
		for (Trade t : repository.findAll()) {
			System.out.println(t);
		}

		System.out.println("\n**Find Trade for a given Id");
		Optional<Trade> ot = repository.findById("t12");
		ot.ifPresent(t -> System.out.println(t));

		System.out.println("\n**Find Trades for a given Book Id");
		repository.findByBookId("b1").forEach(t-> System.out.println(t));
	}

}
