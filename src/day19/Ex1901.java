package day19;

class Point {
	int x, y;
	Point (int x, int y){	// 지역변수가 모든변수중에 제일 우선순위에 있다.
		this.x = x;			// "this" 는 객체 자기자신의 참조값.(주로 생성자에서 많이 쓰이는 표현이다)
		this.y = y;			// (.) 은 소속을 의미하고, 왼쪽에는 반드시 참조값이 온다.
	}
	void showInfo() {
		System.out.println("점("+x+","+y+") 객체입니다.");
	}
}

public class Ex1901 {
	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		p1.showInfo();
	}

}
