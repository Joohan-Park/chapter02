package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int[] a) {
		if (a == null) {
			return null;
		}

		int length = a.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = a[i];
		}

		return result;
	}

	public static int[] doubleToInt(double[] a) {
		if (a == null) {
			return null;
		}

		int length = a.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			result[i] = (int) a[i];
		}

		return result;
	}

	public static int[] concat(int[] s1, int[] s2) {
		
		
		if (s1 == null && s2 == null) {
			return null;
		}
		int length = s1.length + s2.length;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			if ((length / 2) > i) {
				result[i] = s1[i];
			} else if ((length / 2) <= i) {
				result[i] = s2[i - (length / 2)];
			}
		}

		return result;

	}

}
