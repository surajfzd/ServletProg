package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmployeeCrudCollectionApplication {

	public static void main(String[] args) 
	{
		EmpUtil emp=new EmpUtil();
		SpringApplication.run(SpringBootEmployeeCrudCollectionApplication.class, args);
//		System.out.println(emp.getAllEmployee());
	}

}
