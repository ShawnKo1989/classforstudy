package day26;

import java.util.Scanner;
class Triangle {
	int a;
	int b;
	Triangle (int a, int b){
		this.a = a;
		this.b = b;
	}
	double getArea() {
		return a*b/2;
	}
}
public class Q2605 {

	public static void main(String[] args) {
//		- 인스턴스변수 및 인스턴스메서드 : 알아서.
//		키보드로부터 밑변, 높이의 값을 정수로 입력 받아서,
//		Triangle 객체를 생성하세요.
//		Triangle 객체 생성시 호출된 생성자에서 
//		이 두 값들(밑변, 높이)을 파라미터로 받아서 
//		두 변수(밑변, 높이)의 값을 셋팅하고, 
//		Triangle 객체에 삼각형의 넓이를 리턴하는 인스턴스메서드를 
//		만들고, main()에서 이 메서드를 호출하여 삼각형의 넓이를 출력해보세요.
//
//		(실행결과의 예)
//			삼각형의 밑변 입력 : 5 (엔터)
//			삼각형의 높이 입력 : 20 (엔터)
//			밑변이 5, 높이가 10인 삼각형의 넓이는 50.0입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int a = sc.nextInt();
		System.out.print("높이 : ");
		int b = sc.nextInt();
		Triangle tg = new Triangle(a,b);
		System.out.println("밑변이 "+tg.a+", 높이가 "+tg.b+"인 삼각형의 넓이는 "+tg.getArea()+"입니다.");
		

	}

}
