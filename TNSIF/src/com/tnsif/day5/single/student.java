package com.tnsif.day5.single;

public class student extends Citizen{
	
	private int rollno;
	private String clgName;
	
	public student() {
		super();
	}

	public student(String name,String aadhar,String address,int rollno, String clgName) {
		super(name,aadhar,address);
		this.rollno = rollno;
		this.clgName = clgName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", clgName=" + clgName + ", Name=" + getName() + ", Aadhar="
				+ getAadhar() + ", Address=" + getAddress() + "]";
	}
	
	
	
	

}
