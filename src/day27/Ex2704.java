package day27;
class A3{
	void m() {
		System.out.println("m.");
	}
}
public class Ex2704 {
//	static A3 m() {return new A3();}
	static Object m() {return new A3();} 
	//ERR가 안나는 이유는 업캐스팅이 적용되기 때문이다
	public static void main(String[] args) {
//		A3 obj = m(); 
		// downcasting 이기 때문에.... 아래와 같이 강제가 형변환 필요
		A3 obj = (A3)m();
		Object obj2 = m();
		obj.m();
		if(obj2 instanceof A3) {
			((A3)obj2).m();
		}
	}

}
