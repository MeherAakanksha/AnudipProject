package com.polygon;

public class Rectangle implements _polygon{
	
	int length;
	int  breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public int Areaof() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length*breadth);
	}
	
}
