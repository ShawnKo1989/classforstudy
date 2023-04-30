package day4;

public class Ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문자의 비교, 문자열의 비교.
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1==c2); // 같으면  true  다르면 false
		
		String s1= "a";
		String s2 = "A";
//		System.out.println(s1==s2); // X 주의 절대 이렇게 하지 마시오.
		
//		[정리] 문자열의 동등 비교 (내용이 같은지 비교)
//		문자열 1 equals (문자열2) --> 같으면 true 다르면 false
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		
		
		
		
	}

}
