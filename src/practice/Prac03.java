package practice;
class AAA{
	AAA(){
		System.out.println("A객체 입니다.");
	}
}
class BBB extends AAA{
	BBB(){
//		super();
		System.out.println("B객체 입니다.");
		}
}
public class Prac03 {

	public static void main(String[] args) {
		BBB b = new BBB();
	}

}
