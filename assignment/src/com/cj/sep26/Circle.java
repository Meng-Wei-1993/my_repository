package com.cj.sep26;

public class Circle {
	
	double radius;
	final double pai = Math.PI;
	
	public double area(){
		return pai*radius*radius;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
}
