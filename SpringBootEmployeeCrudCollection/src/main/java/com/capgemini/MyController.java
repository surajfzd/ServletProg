package com.capgemini;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	EmpUtil employee;

	@RequestMapping("/hello")
	public List<Employee> getAllTopics() {
		return employee.getAllEmployee();
	}

	public Employee getEmployee(@PathVariable int id) {

		return employee.findEmpById(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/hello")
	public void createEmployee(@RequestBody Employee emp) {
		employee.createEmployee(emp);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/hello/{id}")
	public void updateEmployee(@RequestBody Employee empl, @PathVariable int id) {
		employee.updateEmployee(id, empl);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/hello/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employee.deleteEmployee(id);
	}

}

