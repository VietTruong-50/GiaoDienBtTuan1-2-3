package edu.tuan1;

public class BaiTap5 {

	public static int[] kqBai5() {
		// TODO Auto-generated method stub
		int numb = 0;
		int j = 0;
		int[] arr = new int[10];
		for (numb = 1000; numb <= 2000; numb++) {
			if ((numb % 3 == 0) && (numb % 5 == 0) && (numb % 7 == 0)) {
				arr[j] = numb;
				j++;
			}
		}
		System.out.println("\tTruong Quoc Viet 20198341");
		return arr;
	}
}
