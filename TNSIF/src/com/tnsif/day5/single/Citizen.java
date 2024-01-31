package com.tnsif.day5.single;

public class Citizen {
	
	private String name;
	private String aadhar;
	private String address;
	
	public Citizen() {
		System.out.println("citizen object created");
	}

	public Citizen(String name, String aadhar, String address) {
		super();
		this.name = name;
		this.aadhar = aadhar;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
