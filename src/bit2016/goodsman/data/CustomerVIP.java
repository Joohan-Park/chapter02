package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setName(){
		
//		public 은 자식 패키지에서 접근 가능
		name = "둘리";
//		protected는 자식에서 접근가능
		phone = "010-3551-4188";
//		private은 자식에서 접근 불가능
//		email = "qkrwngks91@nate.com";
	}
}
