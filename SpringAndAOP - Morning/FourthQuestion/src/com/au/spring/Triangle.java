package com.au.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle { //implements InitializingBean , DisposableBean 
	@Autowired
	@Qualifier("PointA")
	private Point PointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point PointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point PointC;
	
	private int Height;
	private int Width;	

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public Point getPointA() {
		return PointA;
	}
	
	public void setPointA(Point PointA) {
		this.PointA = PointA;
	}

	
	public Point getPointB() {
		return PointB;
	}
 
	
	public void setPointB(Point pointB) {
		this.PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		this.PointC = pointC;
	}
	
	public void draw() {
		System.out.println("I am Triangle");
		System.out.println("PointA have " + getPointA().getX() + " as x-axis and " + getPointA().getY() + " as y-axis");
		System.out.println("PointB have " + getPointB().getX() + " as x-axis and " + getPointB().getY() + " as y-axis");
		System.out.println("PointC have " + getPointC().getX() + " as x-axis and " + getPointC().getY() + " as y-axis");
		System.out.println("Height of the triangle is " + Height + " and width is " + Width);
		System.out.println();
	}
 
}
