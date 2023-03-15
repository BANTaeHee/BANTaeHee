package Chap_01;

public class _03_Variables {

	public static void main(String[] args) {
		// 변수 : 어떤 데이터(값)를 저장하는 공간
		String name = "코딩천재";	// 'name'이라는 문자열 변수 선언
		int hour = 15;	// 정수형 변수 선언
		
		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 완료되었습니다.");
		
		double score = 90.5;	// 실수형 
		char grade = 'A';		// 문자
		name = "강백호";	// 여기부터는 변수 name의 값이 바껴서 실행된다.
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade + "입니다.");
		
		boolean pass = true;
		System.out.println("이번 시험에 합격했을까요? " + pass);
		
		double d = 3.14123456789;
		// 3.14와 같은 소수점을 포함하는 실수값을 적으면 기본적으로 double자료형이라고 판단.
		float f = 3.14123456789f;
		System.out.println(d);
		System.out.println(f);
		// 정밀한 소수계산을 하고 싶다면 double 자료형을 사용
		
		//int i = 1000000000000;	// int형의 범위를 초과하므로 에러.
		long l = 1000000000000L;
		l = 1_000_000_000_000L;
		System.out.println(l);
	}

}
