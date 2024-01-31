package com.tnsif.day8.Abstraction;

public class Square extends Shape{
	
	float side;
	
	public Square() {
		this.side=4.0f;
	}
	
	
	public Square(float side) {
		this.side = side;
	}

	
	void calArea()
	{
		area = side*side;
	}
}
