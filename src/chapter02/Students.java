package chapter02;

public class Students extends Person {
	public Students(){
		System.out.println("Student() called");
		age=26; //default 접근자는 접근가능(단, 같은 패키지에서 가능)
		name="박주한"; //protected 는 자식에서 접근 가능(다른 패키지에서도 가능)
		//height=178; //private은 접근 불가
		weight=90; //public은 접근 가능
	}
	public Students(int age){
		System.out.println("Student(int age) called");
	}
}
