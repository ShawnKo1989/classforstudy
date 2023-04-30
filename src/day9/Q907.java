package day9;

import java.util.Scanner;

public class Q907 {

	public static void main(String[] args) {
		//Q907. (고급2) 숫자야구.
//			스캐너 사용시 문자열 입력 : "sc.next()"
//			ex) String s = sc.next();  // 520 (엔터)
//			    ※ s는 "520" (문자열임.)
//			    s.charAt(0) ---> '5'
//			    s.charAt(1) ---> '2'
//			    s.charAt(2) ---> '0'
		
//			심심 ------> 미니프로젝트)Swing 사용 숫자야구를.
		Scanner sc = new Scanner(System.in);
		int com =(int)(Math.random()*999)+100;
		while(true) {
		System.out.println("======= 숫자야구 =========");
		System.out.print("맞추고싶은 세자리 숫자를 입력하세요 : ");
		String input = sc.next();
		
		int a1 = (int)(com/100);
		int b1 = (int)(com%100/10);
		int c1 = (int)(com%10);
		
		char a2 =input.charAt(0);
		char b2 =input.charAt(1);
		char c2 =input.charAt(2);
		
		int[] base = {a2-48,b2-48,c2-48};
		
		int strikeCount = 0;
		int outCount = 0;
		int ballCount = 0;
		
		if(a1!=base[0]&&a1!=base[1]&&a1!=base[2])outCount++;
		if(b1!=base[0]&&b1!=base[1]&&b1!=base[2])outCount++;
		if(c1!=base[0]&&c1!=base[1]&&c1!=base[2])outCount++;
		
		if(a1==base[0])strikeCount++;
		if(b1==base[1])strikeCount++;
		if(c1==base[2])strikeCount++;
		
		if(a1!=base[0]) {
			if(a1==base[1]||a1==base[2])ballCount++;
		}if(b1!=base[1]) {
			if(b1==base[0]||b1==base[2])ballCount++;
		}if(c1!=base[2]) {
			if(c1==base[0]||c1==base[1])ballCount++;
		}
		if (a1==base[0]&&b1==base[1]&&c1==base[2]) {
			System.out.println("축하합니다 정답은 "+a1+b1+c1+"입니다!!");
			break;
		}
		System.out.println(strikeCount +" 스트라이크!!");
		System.out.println(ballCount+" 볼!!");
		System.out.println(outCount+" 아웃!!");
	
		
		}
	}

}
