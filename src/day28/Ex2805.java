package day28;
interface I3{
	void m1();		//p.a
}
interface I4 extends I3{
	void m2();		// p.a
}
interface I5 extends I4{
	
}
class AA implements I4{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		// 마우스 클릭 --> source --> override method 
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		// 또는 잘못된 입력 고침기능으로 추가할수 있다
		// (매우 편한기능이므로 사용이 권장된다.)
	}

}
public class Ex2805 {

}
