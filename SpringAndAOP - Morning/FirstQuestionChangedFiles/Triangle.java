package com.au.spring;

import java.util.Map;
import java.util.Set;

public class Triangle {
	
	private Set<Point> points; 
	private Map<Point,String> sittingAt;
	public Set<Point> getPoints(){
		return points;
	}
	
	public Map<Point, String> getSittingAt() {
		return sittingAt;
	}

	public void setSittingAt(Map<Point, String> sittingAt) {
		this.sittingAt = sittingAt;
	}

	public void setPoints(Set<Point> points){
		this.points = points;
	}
	
	public void draw() {
		for(Point point:points) {
			System.out.println(sittingAt.get(point) + " is sitting at point at vertix " + point.getX() + "," + point.getY());
		}
	}

}
