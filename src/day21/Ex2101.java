package day21;
class AA{
	static int a;
	int b;
	
	void m1() {
		System.out.println("b : " + b);
		System.out.println("클래스변수 a : "+ a);
		
	}
	static void m2() {
//		System.out.println("b : " + b);	//ERR 작동하지 않음 매우중요(객체의 갯수에 따라 어떤것을 불러들일지 판단할수 없는 변수이다)
		// 그렇다면 객체가 하나만 선언되었다면??
		// 하나가 선언되었을때 만약 동작이 된다면 java는 너무 위험한 언어이다. (사용자의 편리성이 떨어진다)
		System.out.println("클래스변수 a : "+ a);
	}
}
public class Ex2101 {

	public static void main(String[] args) {
		AA.a = 10;	//클래스 변수 -> 클래스이름. 으로 접근.
		AA.m2();
		AA obj = new AA();
		AA obj2 = new AA();
		obj.b = 30;
		obj.m1();
		
		obj.a++;	// 클래스변수를 참조변수. 으로 접근가능하다.(할수있지만 권장 X)
		obj.m2();	// 마찬가지로 클래스변수지만 참조변수. 으로 접근가능하다.
		System.out.println(AA.a);
		// 자바의 특징
		// Garbage collector
		// 동적 클래스 로딩 -> 메모리의 효율적 사용
		// 1) .class 파일은 (.java 파일 하나당 하나씩 만들어 지는게 아니라)
		//					그안에 정의된 클래스 단위로 만들어짐.
		// Ex) EX2102.java -> Ex2102 파일 하나로 만들어지지 않고
		// Ex) Ex2102.java -> 1) AA.class 파일 2) Ex2102.class 파일로.
	}

}
