package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.repository.DonorRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Blood Camp Management",version="1.0"))
public class BloodCampAssignmentApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BloodCampAssignmentApplication.class, args);
	}
	
	
}
