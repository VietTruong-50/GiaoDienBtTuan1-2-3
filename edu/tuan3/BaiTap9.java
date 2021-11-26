package edu.tuan3;

public class BaiTap9 {

	public static String kqBai9(int n) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0 };
		int c = 15;
		int x = 0;
		int bang_c = 0, lonHon_c = 0, nhoHon_c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				bang_c++;
			}
			if (c > arr[i]) {
				nhoHon_c++;
			}
			if (c < arr[i]) {
				lonHon_c++;
			}
		}
		System.out.print("Bang c: " + bang_c + " " + ";Nho hon c: " + nhoHon_c + " " + ";Lon hon c: " + lonHon_c);
		System.out.println("\nTruong Quoc Viet 20198341");
		if (n == 0) {
			x = bang_c;
		} else if (n == 1) {
			x = nhoHon_c;
		} else if (n == 2) {
			x = lonHon_c;
		}
		return x + " Số";
	}
}
