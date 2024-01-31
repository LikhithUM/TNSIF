package com.tnsif.day8.Abstraction;

public class Rectangle extends Shape{

	float width,height;
	
	public Rectangle() {
		this.width=5.0f;
		this.height=7.0f;
	}

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea()
	{
		area = width*height;
	}
}
