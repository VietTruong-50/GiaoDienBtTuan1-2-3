package edu.tuan3;

public class BaiTap6 {

	public static String kqBai6() {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 9, 12, 17, 22, 95, 11 };
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			str = str.append("\nCac uoc so thuc su cua so " + arr[i] + " la:");
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] % arr[j] == 0 && arr[i] != arr[j]) {
					str.append(" " + arr[j]);
				}
			}
		}	
		System.out.println("\nTruong Quoc Viet 20198341");
		return str.toString();
	}
}
