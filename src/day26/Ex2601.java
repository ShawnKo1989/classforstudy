package day26;
class AA{
	void m() {
		System.out.println("잠시만");
	}
}
class BB extends AA{
	@Override
	void m() {
		System.out.println("잠깐만");
	}
	void m2() {
		
	}
}
public class Ex2601 {

	public static void main(String[] args) {
		AA obj = new BB();
//		BB obj2 = new AA();
//		m()만 바라볼수 있다.
//		[암기] 부->자는 되고, 자->부는 안된다
		obj.m();
//		obj2.m();
	}
	

}
