package edu.tuan3;

public class BaiTap4 {
	public static int kqBai4() {

		int arr[] = { 5, 2, 8, 3, 9 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print(max);
		System.out.println(" Truong Quoc Viet 20198341");
		return max;
	}
}
