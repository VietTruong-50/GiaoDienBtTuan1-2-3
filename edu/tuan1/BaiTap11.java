package edu.tuan1;

import java.util.Random;

public class BaiTap11 {

	public static int[] kqBai11() {
		Random ran = new Random();
		
		int randomArr[] = {2,5,9,1,0,8}; 
		int count = 0;
		int i=0, j=0;
		
		while(count<randomArr.length-1) {
			i = ran.nextInt(randomArr.length);
			j = ran.nextInt(randomArr.length);
			int tmp = randomArr[i];
			randomArr[i] = randomArr[j];
			randomArr[j] = tmp;
			count++;
		}
		for( i=0; i<randomArr.length; i++) {
			System.out.print(" " + randomArr[i]);
		}
		System.out.println("\tTruong Quoc Viet 20198341");
		return randomArr;
	}
}
