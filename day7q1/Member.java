package com.day7q1;

public class Member {

	String Name;
	int Age;
	String Phone_number;
	String Address;
	double Salary;
	
	void printSalary() {
		System.out.println(Salary);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Member(String name, int age, String phone_number, String address, double salary) {
		super();
		Name = name;
		Age = age;
		Phone_number = phone_number;
		Address = address;
		Salary = salary;
	}

	
	
}

 

