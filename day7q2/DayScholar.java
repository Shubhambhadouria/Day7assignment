package com.day7q2;

public class DayScholar extends Student{

	double transportFee;

	public double getTransportFee() {
		return transportFee;
	}

	public void setTransportFee(double transportFee) {
		this.transportFee = transportFee;
	}

	public DayScholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}

	
	
	
	
}
