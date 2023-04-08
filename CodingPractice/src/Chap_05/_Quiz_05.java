package Chap_05;

public class _Quiz_05 {

	public static void main(String[] args) {
		// 
		int[] sizeArr = new int[10];
		
		for (int i = 0; i < sizeArr.length; i++) {
			sizeArr[i] = 250 + (5 * i);
		}
		for (int size : sizeArr) {
			System.out.println("사이즈 " + size + " (재고 있음)");
		}
	}

}
