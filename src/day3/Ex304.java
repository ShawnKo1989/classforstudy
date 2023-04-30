package day3;

public class Ex304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		정수 리터럴 literal : 정수 실수 문자 문자열
//		정수리터럴 ---->  int형
//		정수리터럴(뒤에 l을 붙이면 long형 으로 만든다)
//		실수리터럴------> double 형
//		실수리터럴 뒤에 f를 붙이면 float형이 된다.
		int num = 21_0000_0000;
		System.out.println(num);
		
//		정수리터럴에 언더바(_) ---> 실행시 무시됨. 숫자가 길어질때 좋다.
//		가독성에 매우 유용해진다.
//		
//		int num2 = 22_0000_0000; // ERR 표현범위를 넘어간다.
//		long num3 = 22_0000_0000;// ERR
		long num3 = 22_0000_0000L;
		System.out.println(num3);
		
		
		
		
		
	}

}
