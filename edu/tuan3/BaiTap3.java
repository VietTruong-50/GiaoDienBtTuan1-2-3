package edu.tuan3;

public class BaiTap3 {

	public static int kqBai3() {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 9 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);
		System.out.println(" Truong Quoc Viet 20198341");
		return min;
	}
}
