package edu.tuan3;

public class BaiTap2 {

	public static int[] kqBai2() {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 9 };
		int count = 0;
		while (count < arr.length) {
			if (kTraSoNt(arr[count]) == 1) {
				System.out.print(" " + arr[count]);
			}
			count++;
		}
		System.out.println(" Truong Quoc Viet 20198341");
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
