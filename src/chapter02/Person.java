package chapter02;

public class Person {
	int age; //default access
	protected String name; //protected access
	private int height; //private access
	public int weight; //public access
	
	public Person(){
		System.out.println("Person() called");
	}
	
	public Person(int age){
		System.out.println("Person(int age) called");
	}
}
