package edu.tuan1;

public class BaiTap10 {

	public static int[] kqBai10() {
		// TODO Auto-generated method stub
		int N = 12345;
		int[] arr = new int[10];
		int j = 0;
		for (int i = 2; i <= N; i++) {
			if (N % i == 0 && kTraSoNt(i) == 1) {
				arr[j] = i;
				j++;
			}
		}
		System.out.println("\tTruong Quoc Viet 20198341");
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
