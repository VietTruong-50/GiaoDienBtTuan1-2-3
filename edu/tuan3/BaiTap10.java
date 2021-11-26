package edu.tuan3;

public class BaiTap10 {

	public static String kqBai10() {
		int arr[] = {1,5,3,3,6,6,6,9,9,3,4,5,6,6,7,7,7,7,7,8,8,9};

		int current = 0;
		int count = 1;
		int max = 0;
		int maxIndex = 0;
		int dem = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i+1]) {
				if (count > max) {
					max = count;
					maxIndex = current;
				}
				current = i + 1;
				count = 1;
			} else ++count;	
		}
		if (count > max) {
			max = count;
			maxIndex = current;
		}

		for (int i = maxIndex; i < maxIndex + max; i++) {
			dem++;
		}
		System.out.println("So luong: " + dem);
		System.out.print("Chi so dau tien: " + arr[maxIndex]);
		System.out.println("\nTruong Quoc Viet 20198341");
		return "So luong: " + dem + "\nChi so dau tien: " + arr[maxIndex];
	}
}
