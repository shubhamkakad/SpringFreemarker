package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class FreemarkerApplication implements CommandLineRunner {

	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new Employee("shubham","kakad","shubham.kakad08@gmail.com"));
		employeeRepository.save(new Employee("s","k","s.kakad08@gmail.com"));
		employeeRepository.save(new Employee("sm","k","sm.kakad08@gmail.com"));
	}

}
