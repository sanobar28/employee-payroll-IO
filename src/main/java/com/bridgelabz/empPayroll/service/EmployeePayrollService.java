package com.bridgelabz.empPayroll.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bridgelabz.empPayroll.model.Employee;

public class EmployeePayrollService {

	// list to store employee data
	private List<Employee> employeePayrollList;

	public EmployeePayrollService() {
		this.employeePayrollList = new ArrayList<>();
	}

	// main
	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readingData();
		employeePayrollService.writingData();
	}

	/**
	 * This method is use to take employee details from console and add to the
	 * employee payroll list.
	 */
	private void readingData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = input.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = input.next();
		input.nextLine();
		System.out.println("Enter Employee Salary: ");
		int salary = input.nextInt();
		employeePayrollList.add(new Employee(id, name, salary));
		input.close();
	}

	/**
	 * This method prints Employee details on the console
	 */
	private void writingData() {
		System.out.println(employeePayrollList);

	}

}
