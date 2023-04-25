package hr.model;

import java.util.*;

public class Department {
	private String name;
	private Set<Employee> employees;
	private Set<Department> subDepartments;

	public String getName() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	} 

	// Get/set methods have package-level visibility to prevent unrestricted direct 
	// access to the underlying data by the clients
	Set<Employee> getEmployees() {
		return employees;
	}

	void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	
	// Public methods implementing "smart" (or business-level) functionality of the class
	public void addEmployee(Employee emp) {
		//TODO MP: note that test methods should be testing for appropriate error conditions such as adding a duplicate employee
		if (emp.getName().equals("Trump"))
			throw new IllegalArgumentException("do not hire Trump!!!");
		employees.add(emp);
	}

	/**
	 * {@return operation success status
	 */
	public boolean removeEmployee(Employee emp) {
		return false;
	}


}
