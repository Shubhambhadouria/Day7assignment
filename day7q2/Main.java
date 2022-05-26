package com.day7q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DayScholar d1 = new DayScholar(1423,"Shubham Singh",50000,10000);
		d1.displaydetails();
		d1.payFee(5000);
		d1.setTransportFee(20000);
		double x =d1.getTransportFee();
		System.out.println("Transport fee is : "+x);
		
		System.out.println("=================================");
		
		Hosteller h1 = new Hosteller(1433,"Golu Singh",20000,3000);
		h1.displaydetails();
		h1.setHostelFee(5000);
		double y = h1.getHostelFee();
		System.out.println("Hosteller fee is : "+y);
		
	}

}
