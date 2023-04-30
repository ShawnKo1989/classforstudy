package day20;

import java.util.Arrays;

public class Ex2003 {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "안녕하세요";
		char c= '안';
		
		// 1.길이 : .length() --> 문자열의 길이 (글자수 )를 리턴.
		System.out.println(s.length());
		System.out.println(s2.length());
		// 2. '동등비교'(내용이 같은지 비교) : .equals()
		System.out.println(s.equals(s2));
		System.out.println(s2.equals(s));
		// 3. 가나다 순 비교 : .compareTo()------> 문자열 1에서 문자열 2를 빼세요
		//				문자열 1. compareTo(문자열2)
		//				--> 문자열1이 문자열2 보다 앞서면(-)부호의 값
		// 				--> 문자열2가 문자열 1보다 앞서면(+)부호의 값
		// 				--> 같으면 0 
		System.out.println("ABC".compareTo("BCA")); // -1
		System.out.println("BCA".compareTo("ABC")); // +...
		System.out.println("AA".compareTo("AA")); //0
		
		// 4. valueOf(예를들어, 숫자) : 숫자를 문자열로 바꿔줌.(클래스메서드)
		String s6 = 55 + ""; //문자열과 더한결과는 무조건 '문자열'이 된다.
		String s7 = String.valueOf(55); // 위의표현과 동일한 결과이다. 별로 좋지않은 방법.
		System.out.println(s6.equals(s7));
		
//		AA obj = new AA();
//		System.out.println(obj); // .toString 이 자동으로 실행되는 구조
//		String S = "obj : "+ obj; // 마찬가지로 .toString 이 실행되는 구조
		
		//<문자열 ---> 정수>
		Integer.parseInt("55"); // 문자열 55를 int 정수값 55로 변환하는 구조.
		String s8 = "55";
		System.out.println(s8+"에 1을 더하면"+(s8+1));
		System.out.println(s8+"에 1을 더하면"+(Integer.parseInt(s8)+1));
		
		// 5. .split(구분자(seperator)) : 문자열을 쪼개어 문자열 배열로.
		String str = "자바_C_파이썬_정처산기"; // ["자바"]["C"]["파이썬"]["정처산기"] String 배열객체
		// 스플릿에 의해 이러한 배열객체로 분리된다.
		String[] arrstr = str.split("_");
		System.out.println("arrstr : " + Arrays.toString(arrstr));
		
		// 6. .substring(시작인덱스)
		System.out.println(s.substring(1));
		System.out.println(s.toUpperCase());
		System.out.println(s); //Hello? //ello?
		
		// 7. .substring(시작인덱스, 끝인덱스+1)
		System.out.println(s.substring(1,4)); // ell [1]~[3] (1부터 4-1까지의 출력)
		// s.substring(1) 1부터 시작해서 끝까지.
		// s.substring(1,4) 1부터 시작해서 3(4-1)까지.
		// 8. indexOf(문자열) : 문자열의 위치 (인덱스) // 왼쪽에서부터
		//						단, 없으면 -1을 출력.
		// 9. lastIndexOf(문자열) : 오른쪽에서부터
		// str : "자바_C_파이썬_정처산기"
		System.out.println(str.indexOf("_"));
		System.out.println(str.lastIndexOf("_"));
		
		// 10. charAt(인덱스) : 인덱스 위치에 있는 한문자를 리턴.
		System.out.println(str.charAt(1));
		// 11. contain(문자열) : 해당 문자열을 포함하고 있으면, True 없으면 False
		System.out.println(str.contains("_"));
		System.out.println(str.contains("~"));
		System.out.println(str.indexOf("~"));
		
		// 12. .replace(old문자열, new 문자열)
		str = str.replace("_"," ");
		System.out.println(str); // 자바 C 파이썬 정처산기

		
	}
	
//	class AA{
//		public String toString() {
//			System.out.println("AA의 toString 으로 호출됨");
//			return "SW지롱!";
//		}
//	}
}
