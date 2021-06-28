package com.bridgelabz.empPayroll.model;

public class Employee {

	int id;
	String Name;
	int salary;

	public Employee() {
	}

	public Employee(int id, String Name, int salary) {
		this.id = id;
		this.Name = Name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
