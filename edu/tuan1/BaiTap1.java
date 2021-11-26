package edu.tuan1;

public class BaiTap1 {
	
	public static int[] kqBai1() {
		int i,j = 0;
		int[] arr = new int[73];
		for(i=4; i<100; i++) {
			if(i>=4 && kTraSoNt(i)==0) {
				arr[j] = i;
				j++;
			}
		}
		return arr;	
	}

	public static int kTraSoNt(int nt) {
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;	
			return 1;
}
} 
