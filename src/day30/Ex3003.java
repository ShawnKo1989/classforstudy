package day30;

public class Ex3003 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println("이 문자열의 길이 : " + s.length());
		}catch(NullPointerException e) {
			System.out.println("널포인터익셉션이 발생했음!");
		}
		System.out.println("실행끝.");
	}

}
