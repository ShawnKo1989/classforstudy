package day27;
class A4{
	int num;	// 지금 상태가 (default)라는 접근제어자가 붙어있다.
				// (default) : 같은 패키지 안에서만 접근 가능.
	private int num2;
	
	void m() {}
	private void m2() {}
}
public class Ex2705 {

	public static void main(String[] args) {
		A4 obj = new A4();
		obj.num = 10;
		//obj.num2 = 20; ERR private 은 같은 클래쓰 안에서만 호출이 가능.
		obj.m();
		//obj.m2(); ERR
	}
}
