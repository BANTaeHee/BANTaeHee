package Chap_01;

public class _07_TypeCasting {

	public static void main(String[] args) {
		// 형변환 TypeCasting
		// 정수형에서 실수형으로
		// 실수형에서 정수형으로
		
		// int score = 93 + 98.8;	// 연산결과는 double형인데 int형 변수에 넣으려고 하니까 오류.
		
		// int to float, double
		int score = 93;	// 정수형 int값
		System.out.println(score);	// 93
		System.out.println((float)score);	// 93.0
		System.out.println((double)score);	// 93.0
		
		// float, double to int
		float score_f = 93.3F;
		double score_d = 98.8;
		System.out.println((int)score_f);	// 93
		System.out.println((int)score_d);	// 98
		
		// 정수 + 실수 연산
		score = 93 + (int) 98.8;	// 93 + 98
		System.out.println(score);	// 191
		
		score_d = 93 + 98.8;	// 93.0 + 98.8
		// 정수와 실수의 계산에서 그 결과가 실수로 들어갈때는 자동으로 형변화이 된다. 
		System.out.println(score_d);	// 191.8
		
		// 변수에 형변환된 데이터 집어넣기
		double convertedScoreDouble = score;	// 191 -> 191.0
		// int -> long -> float -> double	(자동형변환) 작은 범위에서 큰 범위로 갈 때
		
		int convertedScoreInt = (int) score_d;	// 191.8 -> 191
		// 큰 범위에 데이터를 작은 범위에 넣으려고 하니까 에러 발생.
		// double -> float -> long -> int (수동 형변환)
		
		// 숫자를 문자열로
		String s1 = String.valueOf(93);	// String이라는 클래스가 제공해주는 valueOf()라는 기능을 사용해 형변환
		s1 = Integer.toString(93);	// 문자열로 변환해주는 기능
		System.out.println(s1);		// 93
		
		String s2 = String.valueOf(98.8);
		s2 = Double.toString(98.8);
		System.out.println(s2);		// 98.8
		
		// 문자열을 숫자로
		int i = Integer.parseInt("93");
		System.out.println(i);	// 93
		double d = Double.parseDouble("98.8");
		System.out.println(d);	// 98.8
		
		int error = Integer.parseInt("자바");
	}

}
