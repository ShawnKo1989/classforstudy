package day23;
// 왜 자바에서는, 부모클래스의 생성자가 실행(호출)되도록 할까??
class A5 {
	int num1;
	int num3;
	A5(int num1, int num3){this.num1 = num1;this.num3 = num3;}
//	public A5(int num1) {
//		super();
//		this.num1 = num1;
//	}
	
}
class B5 extends A5{
	int num2;
	B5(int num1, int num2, int num3){
		super(num1, num3);
//		this.num1 = num1;
		this.num2 = num2;
	}
}
public class Ex2305 {

	public static void main(String[] args) {
		B5 obj = new B5(10,20,30);
		
		
	}

}

//JDBC 
// 파일(.jar)준비 : ojdbc.jar
// 프로젝




