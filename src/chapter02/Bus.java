package chapter02;

public class Bus extends Car {
	public void test(){
//		부모의 private는 접근 못함
//		speed=0;
		
//		protected는 접근 가능
		accelator = 10;
	}
}
