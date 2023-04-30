package day26;
class A4{
	int num;
	void showNum() {
		System.out.println("num: "+ num);
	}
}
class B4 extends A4{
	int num2;
	void showNum2() {
		System.out.println("num2 : "+ num2);
	}
}
public class Ex2602 {

	public static void main(String[] args) {
		A4 obj = new B4();	//다형성
		obj.num = 100;	//up casting 업캐스팅 이라고 한다
		obj.showNum();

		((B4)obj).num2 = 200;	//casting 캐스팅 이라고 한다.
		((B4)obj).showNum2();	//down casting 의 경우는 강제 형변환으로 밖에 안된다.
		
//		obj2.num = 10;
//		obj2.num2 = 20;	//x
//		obj2.showNum();
//		obj2.showNum(); //x 애매한 것이기 때문에 실행할수 없다
	}

}
