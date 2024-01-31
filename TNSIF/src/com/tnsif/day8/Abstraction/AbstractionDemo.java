package com.tnsif.day8.Abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		shape = new Rectangle();
		shape.calArea();
		shape.show();
		
		shape = new Square();
		shape.calArea();
		shape.show();

	}

}
