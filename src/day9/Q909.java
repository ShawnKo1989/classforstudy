package day9;

import java.util.Scanner;

public class Q909 {

	public static void main(String[] args) {

		//Q909. (고급) 암산게임.
		//		※ 피연산자 2개(a,b)를 난수발생 (1 이상 9 이하)
		//		※ / 의 경우 --> 그 답이 소수점이 안 나오도록.
//				Ex) 4 / _ --> 여기에 올 수 있는 건, 1 또는 2 또는 4.
		//	(실행결과) 맞춰보세요!
		//		 1번문제. 5 + 3 = 8 (엔터)
		//		 2번문제. 7 - 2 = 5 (엔터)
		//		 3번문제. ...
		//		 5번문제. 1 * 8 = 8 (엔터)
		//		 5문제 중 5문제를 맞췄습니다!
		Scanner sc = new Scanner(System.in);
		int score = 0;
		char[] oper= {'+','-','/','%','*'};

		for(int i = 1; i<=5;i++) {
		int a = (int)(Math.random()*9)+1;
		int b = (int)(Math.random()*9)+1;
		System.out.print(i+"번문제. "+a+" "+oper[i-1]+" "+b+" = ");
		int ans = sc.nextInt();
			if((i==1)&&(a+b)==ans)score++;
			if((i==2)&&(a-b)==ans)score++;
			if((i==3)&&(int)(a/b)==ans)score++;
			if((i==4)&&(a%b)==ans)score++;
			if((i==5)&&(a*b)==ans)score++;
		}
		
		System.out.println("5문제 중 "+score+"문제를 맞췄습니다!");

	}

}
