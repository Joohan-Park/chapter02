package chapter02;

public class StudentTest {

	public static void main(String[] args) {
		Person p = new Students();
		
		Person p2 = new Students(10);
		
//		Students s = new Students();
//		Person p3 = s;
		Person p3 = new Students();
		
		Students s = (Students)p3;//다운 캐스팅 명시적(explicit) 캐스팅 해줘햐함
		Person p4 = s;//업 캐스팅 암묵적(implicit) 캐스팅 안해줘도 됨
	}

}
