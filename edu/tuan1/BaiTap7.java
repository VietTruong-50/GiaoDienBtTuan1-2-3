package edu.tuan1;

public class BaiTap7 {

	public static int kqBai7a() {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 0)
				count++;
		}
		System.out.print("\na. Chia hết cho 5: " + count + " số");

		System.out.println("\tTruong Quoc Viet 20198341");
		return count;
	}

	public static int kqBai7b() {
		int count1 = 0;
		for (int i = 0; i <= 100; i++) {

			if (i % 5 == 1)
				count1++;
		}
		System.out.print("\nb. Chia cho 5 dư 1: " + count1 + " số");

		return count1;
	}

	public static int kqBai7c() {
		int count2 = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 2)
				count2++;
		}
		System.out.print("\nc. Chia cho 5 dư 2: " + count2 + " số");

		return count2;
	}

	public static int kqBai7d() {
		int count3 = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 5 == 3)
				count3++;
		}
		System.out.print("\nd. Chia cho 5 dư 3: " + count3 + " số");
		return count3;
	}
}