package day16;

public class Ex1602 {
	static void sayHello(String param){ //리턴타입 X
		System.out.println(param +"님, Hi~");
	}		// 다시 메인으로 보낼수 없는 것들의 한해서 void 메소드를 사용한다.
	static String sayHello2(String param) {
		System.out.print(param); //메인에서 보내주는 문자열을 받아서 출력!!
		return "님, Hi~~"; // 받아주는 스트링 변수나 출력이 필요!!
	}
	public static void main(String[] args) {
		sayHello("YG"); // 출력 : YG님. Hi~
		System.out.println(sayHello2("YG")); //출력
	}

}
