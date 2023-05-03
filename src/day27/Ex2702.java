package day27;
class AA{
	void m() {
		System.out.println("m.");
	}
}
class BB extends AA{
	protected void m() {
		System.out.println("child-m.");
	}
}
public class Ex2702 {

	public static void main(String[] args) {
		AA obj = new BB(); // 여기서 첫번째  m메서드가 가려진다.
		BB obj2 = new BB();
		obj.m();	// 메서드 오버라이딩
		obj2.m();
	}

}
