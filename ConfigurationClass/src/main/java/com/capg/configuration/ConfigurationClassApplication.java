package com.capg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capg.model.Employee;

@Configuration
public class ConfigurationClassApplication {
	@Bean
	public Employee empObj() {
		Employee emp = new Employee();
		emp.setEmpId("S20");
		emp.setEmpName("Sukanya");
		return emp;
	}

}
