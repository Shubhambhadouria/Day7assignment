package com.day7q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager("Shubham Singh Bhadouria",24,"7974003538","276 Bhopal",1200000,"Backend Developer","IT");
		
		System.out.println(" Name : "+m1.getName()+"\n Age : "+m1.getAge()+"\n Mobile Number : "+m1.getPhone_number()+"\n Address : "+m1.getAddress()+"\n Salary : "+m1.getSalary()+"\n Specialisation : "+m1.getSpecialisation()+"\n Department : "+m1.getDepartment());
		
		System.out.println("==================================================");
		
		Employee e1 = new Employee("Golu",24,"7400743588","276 Bhopal",1200000,"Backend Developer","IT");
		
		System.out.println(" Name : "+e1.getName()+"\n Age : "+e1.getAge()+"\n Mobile Number : "+e1.getPhone_number()+"\n Address : "+e1.getAddress()+"\n Salary : "+e1.getSalary()+"\n Specialisation : "+e1.getSpecialisation()+"\n Department : "+e1.getDepartment());
	}

}
