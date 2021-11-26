package edu.tuan1;

public class BaiTap4 {

	public static int[] kqBai4() {
		// TODO Auto-generated method stub
		int numb = 0, j = 0;
		int[] arr = new int[5];
		while (numb < 100) {
			if (numb % 3 == 0 && numb % 7 == 0) {
				arr[j] = numb;
				j++;
			}
			numb++;
		}
		return arr;
	}
}
