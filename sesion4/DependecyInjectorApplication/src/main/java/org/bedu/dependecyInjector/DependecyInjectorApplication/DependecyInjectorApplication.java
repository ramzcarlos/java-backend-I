package org.bedu.dependecyInjector.DependecyInjectorApplication;

import org.bedu.dependecyInjector.DependecyInjectorApplication.config.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependecyInjectorApplication implements CommandLineRunner {
	/*
	//primera forma no recomendable
	@Autowired
	private Greeting greeting;
	 */
	/*
	// Segunda Manera
	@Autowired
	private Greeting greeting;
	public void setGreeting(Greeting greeting){
		this.greeting = greeting;
	}
	 */
	private Greeting greeting;

	// Tercera forma de inyecci[on de dependencias
	// forma recomendable
	//******************************************************
	@Autowired
	public DependecyInjectorApplication(Greeting greeting){
		this.greeting= greeting;
	}
	//*******************************************************

	public static void main(String[] args) {

		SpringApplication.run(DependecyInjectorApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception{
			System.out.println(greeting.greet("Carlos Ramirez"));
	}

}
