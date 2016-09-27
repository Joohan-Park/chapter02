package chapter02;

public class ArrayutilTest {

	public static void main(String[] args) {

		
		
//		int[] arrayInt = { 10, 20, 30, 40, 50 };
		int[] arrayInt = new int[]{10,20,30,40,50};

		double[] arrayDouble = ArrayUtil.intToDouble(arrayInt);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.print(arrayDouble[i]+" ");
		}
		System.out.println();
		double[] arrayDouble2 = { 10.0, 20.0, 30.0, 50.0, 50.0 };

		int[] arrayInt2 = ArrayUtil.doubleToInt(arrayDouble2);

		int[] arrayInt3 = ArrayUtil.concat(arrayInt, arrayInt2);

		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.print(arrayInt2[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arrayInt3.length; i++) {
			System.out.print(arrayInt3[i]+" ");
		}
	}

}
