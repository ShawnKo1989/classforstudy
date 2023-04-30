package day21;

import java.util.Scanner;

class Triangle2{
	int a;
	int b;
	Triangle2(int a, int b){
		this.a = a;
		this.b = b;
	}
	double area() {
		return a*b/2;
	}
}
public class Q2106 {

	public static void main(String[] args) {

//Q2106.	Triangle2 클래스 작성.
//	- 인스턴스변수 : 알아서
//	- 인스턴스메서드 : 알아서
//	main()에서,
//	- 키보드로부터 밑변, 높이의 값을 정수로 입력받아서,
//	- Triangle2 객체를 생성할 때 이를 이용하여 초기 값을 셋팅.
//	- Triangle2 객체의 인스턴스메서드 중 넓이를 '리턴'하는 메서드가 있어서 
//	- 이를 이용하여 이 삼각형의 넓이를
//	"밑변이 ___, 높이가 ___인 삼각형의 넓이는 ___이다."의 형식으로 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int a = sc.nextInt();
		
		System.out.print("높이 : ");
		int b = sc.nextInt();
		
		Triangle2 t = new Triangle2(a,b);
		System.out.println("밑변이 "+t.a+", 높이가 "+t.b+"인 삼각형의 넓이는 "+t.area()+"이다.");
	}

}
