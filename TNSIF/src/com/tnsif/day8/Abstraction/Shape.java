package com.tnsif.day8.Abstraction;

abstract class Shape {
	
	protected float area;
	
	abstract void calArea();

	void show() {
		System.out.println("area is "+ area);
	}
}
