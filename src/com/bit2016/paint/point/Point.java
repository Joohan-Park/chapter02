package com.bit2016.paint.point;

public class Point {
	protected int x;
	protected int y;

	public Point() {
		System.out.println("객체생성");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("객체생성");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("[x=" + x + ", y=" + y + "] 점을 그렸습니다.");
	}

	public void show(boolean visible) {
		if (visible == true) {
			show();
		} else {
			System.out.println("[x=" + x + ", y=" + y + "] 점을 지웠습니다.");
		}

	}


}
