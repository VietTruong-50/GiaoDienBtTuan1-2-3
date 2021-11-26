package edu.tuan1;

public class BaiTap2 {
	public static int[] kqBai2() {
		int nt = 0;
		int count = 0, j = 0;
		int[] arr = new int[20];
		
		while(count<20) {
			if(kTraSoNt(nt)==1) {
				arr[j] = nt;
				count++;
				j++;
			}
			nt++;
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
