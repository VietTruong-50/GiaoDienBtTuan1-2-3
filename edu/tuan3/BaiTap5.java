package edu.tuan3;

public class BaiTap5 {

	public static int kqBai5(int check) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,8,3,9,12,17,22,95};
		int count=0, count1=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=4 && kTraSoNt(arr[i])==0) {
				count++;
			}
			if(kTraSoNt(arr[i])==1) {
				count1++;
			}
		}
		System.out.println("Số hợp số trong dãy: " + count + " số");
		System.out.println("Số nguyên tố trong dãy: " + count1 + " số");
		System.out.println(" Truong Quoc Viet 20198341");
		if(check== 1) return count;
		else return count1;
	}
	public static int kTraSoNt(int nt) {
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;	
			return 1;
}
}
