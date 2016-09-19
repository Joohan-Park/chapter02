package bit2016.goodsman.main;

import bit2016.goodsman.data.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();

		goods.setName("Nikon");
		goods.setPrice(200000);
		goods.setCountSold(50);
		goods.setCountStock(30);
		System.out.println(Goods.count);

		System.out.println(goods.getCountSold());
		System.out.println(goods.getCountStock());
		System.out.println(goods.getName());
		System.out.println(goods.getPrice());

		Goods goods2 = new Goods();

		System.out.println(goods.count);
		goods.showInfo();
		
		
		
		
		int discountPrice = goods.calcDiscountPrice(0.1);
		
		System.out.println(discountPrice);

	}

}