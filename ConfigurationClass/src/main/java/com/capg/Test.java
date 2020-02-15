package com.capg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.configuration.ConfigurationClassApplication;
import com.capg.model.Employee;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClassApplication.class);
		Object obj = context.getBean("empObj");
		Employee e = (Employee) obj;
		System.out.println(e);

	}
}
