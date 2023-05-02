package day27;
class A{
	int a =10;
	void showA() {
		System.out.println("a : "+ a);
	}
}
class B extends A{
	int b =20;
	void showB() {
		System.out.println("b : "+ b);
	}
}
class C extends A{
	int c = 30;
	void showC() {
		System.out.println("c : "+ c);
	}
}
public class Ex2701 {

	public static void main(String[] args) {
		A obj = new B(); // B -> A : 자동형변환 (upcasting)
//		B obj = new A(); ERR 반드시 부모에서 자식으로만 가능.
//		obj.a = 20;
//		obj.showA();
//		((B)obj).b = 400; // A -> B : 명시적형변환 or 강제형변환 (downcasting)
//		((B)obj).showB();
		
		// 그래서, 안전한 코드로 만들기 위해, instanceof 연산자를 사용.
		
		A obj2 = new C();
		if(obj2 instanceof B) {
			((B)obj2).b = 100;
			((B)obj2).showB();
		}
//		B obj3 = new C(); //ERR (아무 상속 관계가 없는 관계에서는 불가하다)
		A obj3 = new B();
		if(obj3 instanceof C) {	//무조건 이상황에서만 쓴다고 묶어서 기억하자
			((C)obj3).c = 10;
		}
		if(obj3 instanceof A) {
			obj3.showA();
		}
//		((C)obj3).c = 10; //ERR 둘은 아무런 상속관계가 없기 때문에 불가능하다.
		// 이렇게 쓸일이 없기때문에 막아논 기능.(다운캐스팅이 아니다)
		
		
	}

}
