package edu.tuan1;

import java.util.Scanner;

public class BaiTap12 {

	public static String kqBai12(int h) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
			  		  
		for(int i=0; i<=h; i++){
			for(int j=1; j<=h; j++){
			  	if(Math.abs(h-j)>=(i)){
			  		str.append(" * ");
			  	}
			  	else{str.append("  ");}
			}
				str.append("\n");
		}System.out.println("\tTruong Quoc Viet 20198341");
		return str.toString();
	}
}