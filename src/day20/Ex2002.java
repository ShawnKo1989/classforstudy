package day20;

public class Ex2002 {
	public static void main(String[] args) {
		String s1 = "정처산기";
		String s2 = "웹개발";
		System.out.println(s1+s2); // 정처산기웹개발 --> '문자열의 결합(Concatenation)'
		// '문자열'은 변경 불가능 객체.(immutable)
		
		String s3 = "웹"; // 문자열 리터럴 --->문자열 객체생성
		String s4 = "웹"; // '경제성'을 고려 ----> 새롭게 생성하지 않음 : 이해.
		s3 = "WEB";
		
		String s5 = new String("웹"); //new라는 키워드는 '무조건 객체' 생성.
		System.out.println(s5);
		System.out.println(s4.equals(s5)); // 문자열 동등 비교 "equals" //true
		System.out.println(s4==s5); // false 참조값의 비교가 되므로....	
	}
}
