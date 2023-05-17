package day29;

interface I1{
	void m1(); //.......................하는 메서드. "public abstract"
}
//익명 클래스로 뭘할까???
// 1. 인터페이스를 구현 (implements) = 클래스 완성.
// 2.
//class I1Imple implement I1{
//	@Override
//	public void m1() {
//		syssout("m1.");
//	}
//}

public class Ex2904 {
	static void m(I1 object,I1 object2) {
		
	}
	public static void main(String[] args) {
		// (복습)"인터페이스는 부-자의 상황에서 부의역할을 할수있다."(다형성에 적용될수있다)"
//		I1 obj = new I1() {
//			@Override
//			public void m1() {
//				System.out.println("m1.");
//			}
//		};
//		obj.m1();
		m(new I1() {
			@Override
			public void m1() {
				System.out.println("m1을 여기서 한번 호출");
			}
		}, new I1() {
			@Override
			public void m1() {
				System.out.println("m1 같은 메서드의 두번째객체로 다시 호출.");
			}
		});
		m(null, null);
}
}