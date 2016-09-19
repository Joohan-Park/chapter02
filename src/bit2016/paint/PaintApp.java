package bit2016.paint;

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
	}

}
