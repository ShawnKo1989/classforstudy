package day21;

import java.util.Scanner;

class Triangles{
	int a;
	int b;
	Triangles(int a, int b){
		this.a = a;
		this.b = b;
	}
	double area() {
		return a*b/2;
	}
}
public class Q2102practice {

	public static void main(String[] args) {
//		Q2102.	직각삼각형 정보를 담고 있는 Triangle 클래스를 정의:
//			- 인스턴스변수 : int a(밑변), int b(높이)
//			- 인스턴스메서드 : ____ area()   ---> 넓이를 계산해서 리턴.
//			main()에서,
//			- Scanner 객체를 사용해서, 밑변과 높이를 입력 받아서,
//			- 객체 생성.
//			- 그 객체 안에 있는 두 변수와 메서드를 사용해서, 아래와 같이 출력:
//			  "밑변이 ___, 높이가 ___인 직각삼각형의 넓이는 ________입니다."
//			(실행결과의 예)
//				밑변 : 10 (엔터)
//				높이 : 5 (엔터)
//				밑변이 10, 높이가 5인 직각삼각형의 넓이는 25.0입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int a = sc.nextInt();
		System.out.print("높이 : ");
		int b = sc.nextInt();
		Triangles t = new Triangles(a,b);
		
		System.out.println("밑변"+t.a+", 과 높이"+t.b+"인 직각삼각형의 넓이는"+t.area()+"입니다.");

	}

}
