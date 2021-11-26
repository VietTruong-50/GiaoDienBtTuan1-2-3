package edu.tuan3;

public class BaiTap7 {
	public static int kqBai7() {
		int arr[] = { 2, 5, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0};
		int min=arr[0];
		boolean isExist = false;
		int n =0;
		for (int i = 0; i < arr.length; i++) {
			isExist = false;
			for (int j = i; j <arr.length; j++) {
				if (arr[i] == arr[j]) {
					isExist = true;
				}
			}
			if (min > arr[i] && !isExist) {
				min = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(" Truong Quoc Viet 20198341");
		return min;
	}
}