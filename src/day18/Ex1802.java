package day18;

import java.util.Arrays;

class Point {
	int x;
	int y;
//	Point() {} // "디폴트 생성자"(default constructor)
	Point(int p1, int p2){
		x = p1;
		y = p2;
	}
	double dist (int x2, int y2) {
		// (x,y)~(x2,y2) 의 거리를 리턴.
		int dx = x2 -x;
		int dy = y2 - y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}

public class Ex1802 {
	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		// p1 은 참조변수인 동시에 지역변수
//		p1.x =1;
//		p1.y = 1;
		Point p2 = new Point(5,4); // 초기화 하지 않을경우 기본값 '0' 으로 초기화 된다.
//		p2.x = 5;
//		p2.y = 4;
//		Point p3 = new Point();
//		p3.x = 1;
//		p3.y = 1;
		
		// 생성자(Constructor) :
		//  - 객체 생성 직후에, 변수들을 초기화 하는 역할!
		// - [주의] "생성자가 객체를 생성하는 게 아님!
		// - 리턴타입이 없고, 그 이름이 클래스 이름과 동일한 일종의 메서드 비슷.
		// - 호출 = "객체 생성 직후"에 자동으로 호출됨(무조건!!).
		// "point p1 = new Point (1,1);"
		//	(참조변수선언 / 객체생성 (설계도 지정) / 생성자호출)
		
		System.out.println("거리 : " + p1.dist(p2.x, p2.y));
		System.out.println("거리 : " + p2.dist(p1.x, p1.y));
		
		System.out.println(p1.x + " "+ p1.y);
		System.out.println(p2.x + " "+ p2.y);
		
		//[참고] 배열 객체 생성시에도 동일하다
		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
		
		
	}

}
