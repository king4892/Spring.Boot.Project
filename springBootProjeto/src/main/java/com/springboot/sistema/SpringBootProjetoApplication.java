package com.springboot.sistema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sistema.entity.Student;
import com.springboot.sistema.repository.StudentRepository;

@SpringBootApplication
public class SpringBootProjetoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjetoApplication.class, args);
	}
	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("vuribis", "da silve", "kra@gmail.com");
		 * 
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("tankdegelo",
		 * "gelado","tankdegelinho@hotmiaul.com"); studentRepository.save(student2);
		 */
		
	}

}
