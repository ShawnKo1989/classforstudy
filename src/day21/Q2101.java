package day21;

import java.util.Scanner;

class Circle {
	int r; //반지름 인스턴스 변수
	Circle(int r){
		this.r=r;
	}
	double area() { // 넓이를 계산해서 리턴
		return Math.PI*r*r;
	}
}
public class Q2101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int a = sc.nextInt();
		Circle c1 = new Circle(a);
		
		System.out.println("반지름이"+c1.r+"인 원의 넓이는 "+c1.area()+"입니다.");
	}

}
