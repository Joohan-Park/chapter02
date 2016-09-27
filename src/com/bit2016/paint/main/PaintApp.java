package com.bit2016.paint.main;

import com.bit2016.paint.i.Drawable;
import com.bit2016.paint.i.Resizable;
import com.bit2016.paint.point.ColorPoint;
import com.bit2016.paint.point.Point;
import com.bit2016.paint.shape.Circle;
import com.bit2016.paint.shape.Pentagon;
import com.bit2016.paint.shape.Rectangle;
import com.bit2016.paint.shape.Shape;
import com.bit2016.paint.shape.Triangle;

import bit2016.paint.Color;

public class PaintApp {

	public static void main(String[] args) {
		//기본생성자
		Point point = new Point();
		point.setX(100);
		point.setY(100);
		point.show();

		//파라미터를 갖는 생성자
		Point point2 = new Point(100, 100);
		point2.show();
		
		point2.show(false);
		
		Point point3 = new Color(100,100,"RED");
		point3.show();
		point3.show(false);
		
		point3.show(true);
		
		Drawable rectangle = new Rectangle(100,100,100,100);
		draw(rectangle);
		Drawable circle = new Circle();
		draw(circle);
		Drawable triangle = new Triangle();
		draw(triangle);
		draw(new Pentagon());
		draw(new ColorPoint(200, 100, "white"));
		
		resize(new Circle(10));
		
		//instanceof test
		Circle c10 = new Circle();
		Shape c11 = new Circle();
		
		System.out.println(c10 instanceof Circle);
		System.out.println(c10 instanceof Shape);
		System.out.println(c10 instanceof Drawable);
		System.out.println(c10 instanceof Resizable);
		System.out.println(c11 instanceof Circle);
		System.out.println(c10 instanceof Resizable);
		System.out.println(c10 instanceof Drawable);
		
		resize2(new Rectangle());
	}
	
	public static void draw(Drawable drawable){
		drawable.draw();
	}
	
	public static void resize2(Drawable drawable){
		if(drawable instanceof Resizable==false){
			return;
		}
		Resizable re = (Resizable)drawable;
		re.resize(1.8);
	}
	
	public static void resize(Resizable resizable){
		Shape shape = (Shape)resizable;
		double area = shape.calculateArea();
		System.out.println(area);
		
		resizable.resize(0.5);
		area = shape.calculateArea();
		System.out.println(area);
	}
	
//	public static void draw(Shape shape){
//		shape.draw();
//	}
//	
//	public static void draw(Circle circle){
//		circle.draw();
//		
//	}
//	
//	public static void draw(Rectangle rect){
//		rect.draw();
//	}
//	public static void draw(Triangle triangle){
//		triangle.draw();
//	}

}
