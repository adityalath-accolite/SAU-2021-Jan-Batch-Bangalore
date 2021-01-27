package com.au.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rectangle {
	@Autowired
	@Qualifier("Point1")
	private Point Point1;
	
	@Autowired
	@Qualifier("Point2")
	private Point Point2;
	
	@Autowired
	@Qualifier("Point3")
	private Point Point3;
	
	@Autowired
	@Qualifier("Point4")
	private Point Point4;

	public Point getPoint1() {
		return Point1;
	}

	public void setPoint1(Point point1) {
		Point1 = point1;
	}

	public Point getPoint2() {
		return Point2;
	}

	public void setPoint2(Point point2) {
		Point2 = point2;
	}

	public Point getPoint3() {
		return Point3;
	}

	public void setPoint3(Point point3) {
		Point3 = point3;
	}

	public Point getPoint4() {
		return Point4;
	}

	public void setPoint4(Point point4) {
		Point4 = point4;
	}

	public void draw() {
		System.out.println("I am Rectangle");
		System.out.println("Point1 have " + getPoint1().getX() + " as x-axis and " + getPoint1().getY() + " as y-axis");
		System.out.println("Point2 have " + getPoint2().getX() + " as x-axis and " + getPoint2().getY() + " as y-axis");
		System.out.println("Point3 have " + getPoint3().getX() + " as x-axis and " + getPoint3().getY() + " as y-axis");
		System.out.println("Point4 have " + getPoint4().getX() + " as x-axis and " + getPoint4().getY() + " as y-axis");
		System.out.println();
	}
 
}
