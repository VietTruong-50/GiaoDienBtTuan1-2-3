package edu.tuan1;

public class BaiTap3 {

	public static int[] kqBai3() {
		// TODO Auto-generated method stub
		int nt = 1000;
		int[] arr = new int[200-65];
		int j = 0;
		while (nt <= 2000) {
			if (kTraSoNt(nt) == 1) {
				arr[j] = nt;
				j++;
			}
			nt++;
		}
		return arr;
	}

	public static int kTraSoNt(int nt) {
		for (int i = 2; i <= Math.sqrt(nt); i++) {
			if (nt % i == 0) {
				return 0;
			}
		}
		if (nt <= 1)
			return 0;
		return 1;
	}
}