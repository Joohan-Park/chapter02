package bit2016.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void setName(){
//		public은 가지 안에서 접근 가능
		name = "도우넛";
//		protected은 자기안에서 접근 가능
		phone = "010-3551-4188";
//		private은 자기안에서 접근 가능
		email = "wngksqkr91@naver.com";
	}
}
