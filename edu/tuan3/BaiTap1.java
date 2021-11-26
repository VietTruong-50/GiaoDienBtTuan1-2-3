package edu.tuan3;

public class BaiTap1 {

	public static int[] kqBai1() {
		// TODO Auto-generated method stub
		int arr[] = {6,3,9,6,1};
		
		for(int i =0; i<arr.length; i++) {
			for(int j =i; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(" Truong Quoc Viet 20198341");
		return arr;
	}
}
