package com.tnsif.day8.MethodOverriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI rbi;
		//Dynamic binding assigning child class object to parent class reference variable
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterst());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateOfInterst());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterst());

	}

}
