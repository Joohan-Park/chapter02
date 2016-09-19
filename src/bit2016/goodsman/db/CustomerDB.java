package bit2016.goodsman.db;
import bit2016.goodsman.data.Customer;

public class CustomerDB {
	void insert(){
		Customer c = new Customer();
//		public은 다른 패키지에서 접근 O
		c.name = "안대혁";
//		protected 는 다른 패키지에서는 접근안됨
//		c.phone = "010-3551-4188";
		
//		private 은 다른 패키지에서 접근불가능
//		c.email = "wngksqkr91@naver.com";
	}
}
