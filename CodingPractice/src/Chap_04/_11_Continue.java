package Chap_04;

public class _11_Continue {

	public static void main(String[] args) {
		// Continue
		
		// 치킨 주문 손님중에 노쇼 손님이 있다고 가정
		// For문
		int max = 20;	// 최대 판매 수량
		int sold = 0;	// 현재 판매 수량
		int noShow = 17; // 대기번호 17번 손님이 노쇼
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			
			// 손님이 없다면...
			if (i == noShow) {
				System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;	// 만나게 되면 이 이하에 있는 문장들은 실행되지 않고 다시 위 반복문 증감으로 넘어간다.
			}
			
			sold++;	// 판매처리
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
		
		System.out.println("----------------------");
		// while 문
		sold = 0;
		int index = 0;	// 손님 번호
		//while (index <= 50) {
		while(true) {
			index++;
			System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
			
			// 손님이 없다면...
			if (index == noShow) {
				System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
				continue;
			}
			
			sold++;		// 판매 처리
			if (sold == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
	}

}
