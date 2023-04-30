package day21;

import java.util.Scanner;
class Triangle {
	int a;
	int b;
	Triangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	double area() {
		return a*b/2;
	}
}
public class Q2102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변: ");
		int input1 = sc.nextInt();
		System.out.print("높이 : ");
		int input2 = sc.nextInt();
		Triangle t1 = new Triangle(input1,input2);
		
		System.out.println("밑변이 "+t1.a+",높이가 "+t1.b+"인 직각삼각형의 넓이는 "+t1.area()+"입니다.");
		
	}

}
