package com.day7q2;

public class Student {
 
	int studId;
	String studName;
	double examFee;
	
	void displaydetails() {
		System.out.println("Student's ID is : "+studId);
		System.out.println("Student's Name is : "+studName);
		System.out.println("Student's Exam Fee is : "+examFee);
	}
	
	double payFee(double fee) {
		if(fee==examFee)
		{
			System.out.println("Amount is being paid : "+fee);
			return fee;
		}
		else
		{
			System.out.println("Amount is being payed : "+fee);
			System.out.println("Remaining amount to be paid : "+(examFee-fee));
			return fee;
		}
	}

	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}

	
	
}
