package bit2016.paint;

import com.bit2016.paint.point.Point;

public class Color extends Point {
	
	private String color;
	
	public Color(int x, int y, String color){
		setX(x);
		setY(y);
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println("[x=" + getX() + ", y=" + getY() + ", Color="+color + "] 점을 그렸습니다.");
	}

}
