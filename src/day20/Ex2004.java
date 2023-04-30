package day20;

class Point {
	int x;
	int y;
	
	static int cnt; // 변수선언 앞에 "static" ---> "클래스변수"
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		cnt++;
	}
	double dist(Point p2){	// 인스턴스 메서드
		int x2 = x - p2.x;
		int y2 = y - p2.y;
		return (Math.sqrt(x2*x2+y2*y2));
//		cnt++; // 인스턴트 메서드에서는 클래스변수를 호출할수 없다.
	}
	static void showCnt(){	// ---> 클래스 메서드
		System.out.println("지금까지 생성된 쩜객체의 갯수 : "+ cnt);
	}
}

public class Ex2004 {
	
	public static void main(String[] args) {	//static --> 클래스 메서드
		
		//변수
		// 어떤값을 가지냐에 따라서, 1) 기본데이터타입 변수 2) 참조변수
		// 유효범위에 따라서 1)지역변수 2) 인스턴스 변수 3) 클래스변수
		
		// 메서드
		// 1) 인스턴스메서드 2) 클래스메서드
		Point.showCnt();
		Point p1 = new Point(1,1);
		Point.showCnt();
		Point p2 = new Point(4,5);
		Point.showCnt(); // 클래스 메서드 호출 ---> "클래스이름."으로 
		System.out.println(p1.dist(p2)); // 인스턴스 메서드 호출--> "참조변수."으로
		// 인스턴스 변수와 클래스 변수
		// 인스턴스 메서드와 클래스메서드
		//[정리] 인스턴스변수와 인스턴스메서드에 접근 : "참조변수."으로 접근.
		// 클래스변수와 클래스메서드에 접근: "클래스이름."으로 접근.
		//[정리] 지역변수는 '초기화'가 필수?? Yes
		// Ex) int num; 
		// sysout(num) //ERR
		// 인스턴스 변수는 자동초기화 -> '기본값'(default value)
		// 클래스 변수는 자동초기화 -> '기본값'(default value)
		
		//월요일 인스턴스 메소드에서-> 클래스메소드 호출 가능한 경우 설명 요구 필요 
		
	}

}
