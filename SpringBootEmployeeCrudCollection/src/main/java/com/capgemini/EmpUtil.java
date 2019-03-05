package com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmpUtil {

	// List<Employee> list = new ArrayList();
	Employee employee = new Employee();

	// public EmpUtil()
	// {
	// list.add(new Employee(1001, "Suraj", "CEO", 1233));
	// list.add(new Employee(1002, "TGR", "MANAGER", 2332));
	// list.add(new Employee(1003, "YTY", "ASSISTANT", 42334));
	// list.add(new Employee(1004, "JUYJT", "VICE PRESIDENT", 1232));
	// }
	//

	private List<Employee> list = new ArrayList<>(Arrays.asList( // Arrays.asList is not mutable
			new Employee(1001, "Suraj", "CEO", 1233), new Employee(1002, "TGR", "MANAGER", 2332),
			new Employee(1003, "YTY", "ASSISTANT", 42334)));

	public List<Employee> getAllEmployee() {
		return list;
	}

	public Employee findEmpById(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				Employee empl = list.get(i);
				return empl;
			}
		}
		return null;
	}

	public void createEmployee(Employee empl) {
		list.add(empl);
	}

	public void updateEmployee(int id, Employee empl) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.set(i, empl);
			}
		}
	}

	public void deleteEmployee(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.remove(i);
			}
		}
	}

}
