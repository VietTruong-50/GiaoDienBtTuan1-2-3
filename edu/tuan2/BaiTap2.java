package edu.tuan2;


public class BaiTap2 {

	public static double kqBai2(int n){
		int i=0;

		double sum1=1 , sum2=0;
		for(i=1;i<=n;i++) {
			sum1 *=i;
			sum2 += 1/sum1;  
		}
		System.out.println(sum2);
		
		System.out.println(" Truong Quoc Viet 20198341");	
		return sum2;
	}
}
