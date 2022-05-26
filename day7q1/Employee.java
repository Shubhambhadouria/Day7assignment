package com.day7q1;

public class Employee extends Member {

	String Specialisation;
	String Department;
	
	public String getSpecialisation() {
		return Specialisation;
	}

	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Employee(String name, int age, String phone_number, String address, double salary, String specialisation,
			String department) {
		super(name, age, phone_number, address, salary);
		Specialisation = specialisation;
		Department = department;
	}
	
	
}
