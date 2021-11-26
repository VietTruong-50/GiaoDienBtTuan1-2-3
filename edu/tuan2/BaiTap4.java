package edu.tuan2;

public class BaiTap4 {

	public static int[] kqBai4(int x) {
		int[] arr = new int[x];
		int j = 0;
		for (int i = 0; i < x; i++) {
			arr[j] = fibonacci(i);
			j++;
		}
		System.out.println(" Truong Quoc Viet 20198341");
		return arr;
	}

	public static int fibonacci(int n) {
		int x0 = 0, x1 = 1, xn = 1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				x0 = x1;
				x1 = xn;
				xn = x0 + x1;
			}
		}
		return xn;
	}
}