package day28;
interface I2{
	void m1(); //p.a
	default void m2() {
		System.out.println("디폴트메서드m2(). 기본적으로 존재함.");
	}
	static void m3() {
		System.out.println("스태틱메서드 m3(). 이미 완성되어있다.");
	}
}
class I2Impl implements I2{
	@Override
	public void m1() {
		System.out.println("m1().");
	}
}
public class Ex2804 {
	public static void main(String[] args) {
		I2 obj = new I2Impl();
		obj.m1();
//		obj.m3();		ERR 스태틱메서드는 "참조변수" 으로 접근 X
		I2.m3();		// 스태틱메서드는 "인터페이스 이름."으로만 접근가능
		obj.m2();
	}
}
