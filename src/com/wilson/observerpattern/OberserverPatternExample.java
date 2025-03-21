package com.wilson.observerpattern;

public class OberserverPatternExample {
	
	public static void main(String[] args) {
		
		Customer wilson = new Customer("Wilson");
		Customer rahul = new Customer("rahul");
		Customer kartik = new Customer("kartik");
		Customer chetan = new Customer("chetan");
		Customer purvesh = new Customer("purvesh");
		
		InsuranceCompany LIC = new InsuranceCompany("LIC");
		
		LIC.addSubscriber(purvesh);
		LIC.addSubscriber(wilson);
		
		LIC.broadcastMessage("Hello tomorrow is a holiday!");
	}

}
