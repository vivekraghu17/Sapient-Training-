package com.company.springbootworks.dbconfig;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.springbootworks.beans.Address;
import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.repo.EmployeeRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return String -> {
			new Employee(342, "Kushal", 12, "kush@push.com", new Address("567", "Randajuk", "Kukilji", "FSA"));
		};
	}
}
