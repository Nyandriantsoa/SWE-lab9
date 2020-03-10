package edu.mum.cs.cs425.eregistar;

import edu.mum.cs.cs425.eregistar.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ERegistarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERegistarApplication.class, args);
	}

}
