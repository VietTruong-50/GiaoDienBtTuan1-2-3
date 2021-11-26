package edu.tuan3;

public class BaiTap12 {

	public static String kqBai12() {
		// TODO Auto-generated method stub

		int A[] = { 1, -2, 5, 6, 8, -9, 4, 29, 11, -7 };
		int B[] = { 6, 8, -9, 4 };
		int n = A.length;
		int m = B.length;
		int k = 0;
		String str = null;

		if (is_a_contain_b(A, n, B, m))
			str = "\nA là dãy con của B";
		else {
			str = "\nA không phải là dãy con của B";
		}
		System.out.println(" Truong Quoc Viet 20198341");
		return str;
	}

	public static boolean is_a_contain_b(int A[], int n, int B[], int m) {
		int i, j, k;
		boolean res = false;
		if (n < m)
			return false;
		for (i = 0; i < n; i++) {
			if (B[0] == A[i] && n - i >= m) {
				k = i + 1;
				res = true;
				for (j = 1; j < m; j++, k++) {
					if (B[j] != A[k]) {
						res = false;
						break;
					}
				}
				if (res)
					break;
			}
		}
		return res;
	}
}
