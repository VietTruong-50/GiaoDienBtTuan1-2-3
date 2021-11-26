package edu.tuan3;

public class BaiTap11 {

	public static String kqBai11() {
        String str = "1533666993456677777889";
        StringBuffer kq = new StringBuffer();
        int current = 0, j = 0;
		int count = 1, max=0, maxIndex=0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }
                current = i + 1;
                count = 1;
            } else {
                ++count;
            }
        }
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }

        for (int i = maxIndex; i < maxIndex + max; i++) {
            kq = kq.append( str.charAt(i));
        }
        System.out.println("\nTruong Quoc Viet 20198341");
		return kq.toString();
    }

}
