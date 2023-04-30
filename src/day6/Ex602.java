package day6;

public class Ex602 {
	public static void main(String[] args) {
//		반복문 / for 문 / while 문/ do~while 문
		// 1 2 3 4
		int i;
		for (i = 1; i<=4; i++) {
			System.out.print(i + " ");
		//중괄호 실행 직전에 조건검사.
		//중괄호 안에서만 살아있는 변수다. i
		}
		System.out.println("i : "+ i);
		//줄바꿈
		System.out.println();
//		System.out.print(); ERR
		
//		-----------------------------------------
		
		//1 2 3 4
		i=1;
		while (i<=4) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		

//		------------------------------------------

		i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while (i<=4); // 세미콜론(;) 잊지 마세요 (do ~while)
					
	}
}