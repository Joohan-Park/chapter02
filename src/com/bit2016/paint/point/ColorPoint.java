package com.bit2016.paint.point;

import com.bit2016.paint.i.Drawable;

public class ColorPoint extends Point implements Drawable {
	
	private String color;
	public ColorPoint(){
		
	}
	public ColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		show(true);
		
	}
	@Override
	public void show() {
		System.out.println("[x=" + x + ", y=" + y + ", Color="+color+"] 점을 그렸습니다.");
	}
	
	


	

}
