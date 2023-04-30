package day21;

import java.util.Scanner;

class Circles{
	int r;
	Circles(int r){
		this.r = r;
	}
	double area() {
		return r*r*Math.PI;
	}
}
public class Q2101practice {

	public static void main(String[] args) {

//			Q2101. class Circle 정의:
//			- 인스턴스변수 : int r(반지름)
//			- 인스턴스메서드 : ____ area() // 넓이를 계산해서 리턴.
//       	main()에서,
//			- Scanner 객체 사용해서, 반지름을 입력받아서,
//			- 객체 생성.
//			- 출력: "반지름이 ___인 원의 넓이는 ___입니다."
//			(실행결과의 예) 반지름 : 10 (엔터)
//		     반지름이 10인 원의 넓이는 314._______입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int r  = sc.nextInt();
		Circles c1 = new Circles(r);
		System.out.println("반지름이"+c1.r+"인 원의 넓이는 "+c1.area()+"입니다.");
	}

}
