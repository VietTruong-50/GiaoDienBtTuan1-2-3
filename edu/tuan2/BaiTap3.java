package edu.tuan2;



public class BaiTap3 {

	public static double kqBai3(int n){

		int i=0;
		
		double sum1=1 , sum2=0, sum3=0;
		for(i=1;i<=n;i++) {
			sum1 *=i;
			sum2 += sum1;
			sum3 += 1/sum2;  
		}
		System.out.println(sum3);
		
		System.out.println(" Truong Quoc Viet 20198341");
		return sum3;	
	}
}
