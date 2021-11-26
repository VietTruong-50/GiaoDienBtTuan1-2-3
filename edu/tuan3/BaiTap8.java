package edu.tuan3;

import java.util.Arrays;

public class BaiTap8 {
	public static int[] kqBai8() {
		int arr[] = { 5, 2, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0 };
		int[] brr = new int[arr.length];
		int bSize = 0;
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] != 0) {
				brr[bSize++] = arr[i];
			}
		}
		brr = Arrays.copyOfRange(brr, 0, bSize);
		System.out.println(Arrays.toString(brr));
		System.out.println(" Truong Quoc Viet 20198341");
		return brr;
	}
}