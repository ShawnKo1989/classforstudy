package day22;

class A2{
	int a;
	void show() {
		System.out.println("a : "+a);
	}
}
class B2 extends A2{
	int b;
//	void show2() {
//		System.out.println("b : "+b);
//	}
	@Override					// --------> 오버라이드 애노테이션(바로밑에 메서드에만 영향을 미친다)
	void show() {
		super.show();	// super 란 부모클래스의 객체를 말함.
		System.out.println("a : " + a +" b : "+b);
	}
	
}
class C2 extends B2{
	int c;
	@Override
	void show() {
		super.show();
		System.out.println("a : "+a + "b : "+b + "c : "+ c);
	}
}
public class Ex2203 {

	public static void main(String[] args) {
		A2 obj1 = new A2();
		B2 obj2 = new B2();
		C2 obj3 = new C2();
		obj3.a = 10;
		obj3.b = 20;
		obj3.c = 30;
		obj3.show();	// 이름은 같지만 내용이 다르게 정의된다 ( 자식클래스에서)---> 오버라이딩
//		obj2.show2();	// 부모클래스의 //// or자식클래스의 show 가 실행?????(answer : 자식)
		
		// @override (오버라이드 애노테이션) 를 하고있다는 표현(가급적 써주세요)
		//------> 그 바로밑줄에서 정의되고 있는 메서드가 (상속관계에서) 자식클래스가 오버라이딩 하고 있는 메서드라는 표시.
		// -->>> 써도 되고, 안써도 됨........ 쓰는걸 추천함
		}

}
