package com.polygon;

public class Triangle implements _polygon {
	
	int length;
	int  breadth;
	int height;
	
	public Triangle(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
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
