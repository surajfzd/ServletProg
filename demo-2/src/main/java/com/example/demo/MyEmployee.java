package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEmployee 
{
	@RequestMapping("/hello")
		public Employee getEmployee()
		{
			Employee employee=new Employee();
			employee.setName("SurajSingh");
			employee.setId(1001);
			employee.setAddress("Address");
			return employee;
		}
	
	

}
