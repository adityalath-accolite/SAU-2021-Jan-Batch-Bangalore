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
		System.out.println("PointA have " + getPointA().getX() + " as x-axis and " + getPointA().getY() + " as y-axis");
		System.out.println("PointB have " + getPointB().getX() + " as x-axis and " + getPointB().getY() + " as y-axis");
		System.out.println("PointC have " + getPointC().getX() + " as x-axis and " + getPointC().getY() + " as y-axis");
	}
 
	//when we dont want to implement interfaces specific to spring, write own methods and refer from xml
	public void onInit() {
		System.out.println("Triangle bean initialized");
	}
	
	public void onCleanup() {
		System.out.println("Triangle bean destroyed");
	}

}
