package practice;

import java.util.Arrays;

public class StringEx001 {

	public static void main(String[] args) {
		// 5. .split(구분자(seperator)) : 문자열을 쪼개어 문자열 배열로.
		String str = "1234_5678_1234_5678"; // ["자바"]["C"]["파이썬"]["정처산기"] String 배열객체
		// 스플릿에 의해 이러한 배열객체로 분리된다.
		String[] arrstr = str.split("_");
		
		
		System.out.println("arrstr : " + Arrays.toString(arrstr));
				
	}

}
