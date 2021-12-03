package com.javaex.ex03;

import java.util.Objects;

public class Point {

	int x;
	int y;

	//
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
		}

	public void setY(int y) {
		this.y = y;
	}

	//
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	//equals시작
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		// a.x==b.x && a.y==b.y	this = x/0x222 / 2 둘다 사용됨
		System.out.println("a.x = "+ this.x);
		System.out.println("a.y = "+ this.y);
		
		System.out.println("b.x = "+ p.x);
		System.out.println("b.y = "+ p.y);
		
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	//equals 끝
	
	
}
