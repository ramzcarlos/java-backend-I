package org.bedu.dependecyInjection;

import jakarta.annotation.PostConstruct;
import org.bedu.dependecyInjection.model.Person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependecyInjectionApplication implements CommandLineRunner {
	private Person person;

	public DependecyInjectionApplication(Person person){
		this.person=person;
	}
	public static void main(String[] args) {

		SpringApplication.run(DependecyInjectionApplication.class, args);
	}

	@PostConstruct
	public void init(){
		person.setName("Carlos");
	}


	@Override
	public void run(String[] args){
		System.out.println(person.greet("Sonia"));
	}
}
