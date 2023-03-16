package Chap_01;

/*
 (실행 결과)
 상암08번 버스
 약 3분 후 도착
 남은 거리 1.2km
 */
public class _Quiz_01 {

	public static void main(String[] args) {
		
		String busNum = "상암08";	// 버스 번호
		int time = 3;		// 남은 시간
		double distance = 1.2;	// 남은 거리
		
		System.out.println(busNum + "번 버스");
		System.out.println("약 " + time + "분 후 도착");
		System.out.println("남은 거리 " + distance + "km"); 
	}

}
