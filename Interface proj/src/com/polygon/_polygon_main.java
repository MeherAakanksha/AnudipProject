package com.polygon;

public class _polygon_main {

	public static void main(String[] args) {
		_polygon rec=new Rectangle(8,2);
		_polygon tri= new Triangle(4,2,3);
		
		System.out.println("area of a rectangle :" +rec.Areaof());
		System.out.println("perimeter of a rectangle :" +rec.getPerimeter());
		System.out.println("area of a Triangle :"+ tri.Areaof());
		System.out.println("perimeter of a Triangle :"+ tri.getPerimeter());

	}

}
