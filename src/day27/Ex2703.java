package day27;

// "Variable Hiding" -> 배리어블 하이딩
class A2{
	int num = 10; // 가려지지 않는다.
}
class B2 extends A2{
	int num = 20; // 
}
public class Ex2703 {

	public static void main(String[] args) {
		// 변수에는 오버라이딩이 적용이 안된다.
		A2 obj = new B2();
		B2 obj2= new B2();
		System.out.println(obj.num); // 10,변수의 앞에 있는 타입을 따라간다.
		System.out.println(((B2)obj).num); // 20
		System.out.println(obj2.num);	// 20
		System.out.println(((A2)obj2).num); // 10
	}

}
