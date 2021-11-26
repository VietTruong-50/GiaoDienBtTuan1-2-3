package edu.tuan1;

import java.lang.Math;

public class BaiTap6 {

	public static int[] kqBai6() {
		int p = 2;
		int count = 0;
		int[] arr = new int[5];
		int j = 0;
		do {
			if (kTraSoNt(p) == 1) {
				if (p != 11) {
					arr[j] = (int) (Math.pow(2, p - 1) * (Math.pow(2, p) - 1));
					count++;
					j++;
				}
			}
			if (count == 5)
				break;
			p++;
		} while (count > 0);
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
