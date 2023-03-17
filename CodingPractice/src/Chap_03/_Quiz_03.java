package Chap_03;

public class _Quiz_03 {

	public static void main(String[] args) {
		String num1 = "901231-1234567";
		String num2 = "030708-4567890";
		
		System.out.println(num1.substring(0,8));	// 0 위치부터 8 위치 직전까지
		System.out.println(num1.substring(0, num1.indexOf("-") + 2));	// 0 위치부터 하이픈 위치 + 2 직전까지
		System.out.println(num2.substring(0,8));
	}

}
