package edu.tuan1;

public class BaiTap8 {

	public static int kqBai8() {
		// TODO Auto-generated method stub
		int N=15;
		int arr[] = new int[N];
		int min = 0;
		for(int i=2; i<N; i++) {		//Gan uoc so cua N vao mang arr[]
			if(N%i==0) {
				arr[i]=i;
			}
		}
		int vtringuyentodau = timViTriSoNtDau(arr, N);
		
		if(vtringuyentodau==0) {
			System.out.println("Không có ước số là số nguyên tố");
		}
		else {
			min =  timSoNtLonNhat(arr, N, vtringuyentodau);
			System.out.println("\nƯớc số nguyên tố nhỏ nhất là: " + min);
		}System.out.println("\tTruong Quoc Viet 20198341");
		return min;
	}

//Tim vi tri so nguyen to dau
	public static int timViTriSoNtDau(int arr[], int N) {				
		for(int i=0; i<N; i++) {
			if(kTraSoNt(arr[i])==1) {
				return i;
			}
		}
		return 0;
	}

	//Tim so nguyen to lon nhat
	public static int timSoNtLonNhat(int arr[], int N, int vtringuyentodau) { 	
		int min = arr[vtringuyentodau];
		for(int i = vtringuyentodau+1; i<N; i++) {
			if(kTraSoNt(arr[i])==1 && arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int kTraSoNt(int nt) { 		//Kiem tra so nguyen to
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;
			return 1;
	}
	
}
