package day28;
interface Inter1{
	int num =5; // 변수--> 사실은 상수(public static final 강제됨.)
	void showNum();
}
class AAAA implements Inter1{
	@Override
	public void showNum() {
		System.out.println(num);
	}
}
public class Ex2803 {

	public static void main(String[] args) {
		System.out.println(Inter1.num); // 5 --> static 확인.
//		Inter1.num =1; ERR
		AAAA obj = new AAAA();
		obj.showNum();
	}

}
