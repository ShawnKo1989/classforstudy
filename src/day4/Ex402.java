package day4;

import java.util.Scanner;

public class Ex402 {

	public static void main(String[] args) {
		//스캐너 객체 생성
		
//		Scanner sc = new Scanner(System.in);
		
//		// 정수값 하나 입력받아 a/정수값 하나더 입력받아.b
		
//		System.out.print("온도 a를 입력하세요 : ");
//		int a = sc.nextInt();
//		System.out.print("온도 b를 입력하세요 : ");
//		int b = sc.nextInt();
//		
		// 두값들중 큰 값, 작은값을 출력 (두값은 다르다)
		
//		if (a>b) {
//		int max = a;
//		int min = b;
//		System.out.println("큰값 : " + max);
//		System.out.println("작은값 : "+ min);
//		}
//		if(b>a) {
//			int max = b;
//			int min = a;
//			System.out.println("큰값 : "+ max);
//			System.out.println("작은값 : "+ min);
//		}
////		
//		int max = a>b? a:b;
//		int min = a>b? b:a;
//		System.out.println("큰값 : "+ max);
//		System.out.println("작은값 : "+ min);
		
//		삼항 연산자를 이용해서 3개의 정수중 가장 큰 수를 출력
//		int a = 27;
//		int b = 25;
//		int c = 50;
//		
//		int a1 = a>b? a:b;
//		int b1 = b>c? b:c;
//		int max = a1>b1 ? a1:b1;
//		System.out.println("max : " +max);
		
//		---------------------------------------------------
//		연산자(Operator).
//
//		1. 산술연산자. + - * / %
//			/ ---> '정수형' / '실수형'
//			% (나머지 연산자)
//			Ex) int a = 10;
//			     int b = 3;
//			     sysout(a/b);    // __
		
//		[고급]
//		실행결과 
//		정수입력 : 15327 엔터
//		거꾸로 : 72351
//		모든자릿수의 합 18 // 7+2+3+5+1 = 18
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Int의 범위를 넘지않는 정수를 입력하세요: ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 10; i <(a*10); i *=10) {
			int reverse = (a%i)/(i/10);
			System.out.print(reverse);
			sum += (int)(a%i)/(i/10); 
		}
		System.out.println("\n각 자릿수 숫자의 총합은 : "+sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("다섯자리 정수값을 입력하세요  : ");
//		int a = sc.nextInt();
//		int b = a%10;
//		System.out.print(b);
//		
//		int c = a%100;
//		c-=b;
//		System.out.print(c/10);
//		
//		int d = a%1000;
//		d-=a%100;
//		System.out.print(d/100);
//		
//		int e = a%10000;
//		e-=a%1000;
//		System.out.print(e/1000);
//		
//		int f = a-a%10000;
//		System.out.println(f/10000);
//		
//		System.out.println("다섯자리 정수의 총합은 : " +(int)(b+c/10+d/100+e/1000+f/10000));
		
		
//		---------------------------------------------------------------------------------
//		"대입연산자 (=)" 오른쪽을 정리해서 왼쪽에 담는다.
//		ex) int num = 5+ 3*a++/7;
//		자바 이문장을 실행할때 어떤연산자부터 어떤 순서로 실행할까
//		참고 : 자바 연산자 우선순위.구글링.
		
//		ex) 
//		int a = 3;
//		int b = 5;
//		b=a;
//		 a+=1;
//		 a/=2;
//		 a*= b;
//		 System.out.println(a); //6
//		 System.out.println(b); //3
		
//		논리연산자 / 비트연산자
//		
//		-논리 연산자: 1) true와 false 에 대한 연산
//				   2) 연산의 결과는 boolean 타입의 값.
//				   --> AND, OR, NOT 등등..
//				   --> '진리표'(truth table)
//				   AND 연산: 둘다 true 여야 'true'
//				   OR 연산 : 둘중 하나라도 true면 true
//				   NOT 연산: 뒤집어라
//						
//		-비트 연산자 : 비트단위(2진수 상태로)로 연산
//		[암기] ^ : caret 캐럿 
//			  &: ampersand앰퍼샌드
//			  ~:tilde 틸드
//			  |: pipe 파이프
		
//		---------------------------------------------
//		논리연산자 && || ! ^
//		---> true 와 false 에 대한 연산 
		
//		비트연산자 &  |  ~ ^
//		--> 0과 1에대한 연산
		
//		 [1] &&(AND연산자): 둘다 true 여야만 true
//		 ex) System.out.println(true& true);
//		 ex) int num = 10;
//		 System.out.println(5<num && num <15);
//		 ex) num이 짝수이고, 0보다 크면 true
//			--> sysout(num%2==0&&num>0);
		
//		 [2] &(AND연산자): 둘다 1 이라면 1.
//			ex) sysout(1&3); //1
//		 ex) sysout(0b0001 & 0b0011);
		
//		 [3] OR 연산자: 둘중 하나라도 true 면 true
//		 ex) System.out.println(true||false); //true
//		 	 System.out.println(true||true); //true
//		 ex) int num = 10;
//		 	sysout(num >=10||num%2==0); //S.C.E (참고)
//		 ex) num 이 홀수이거나 5이상이면 true
//			System.out.println(num %2==1||num>5);
//		 ex) num 이 0보다 작거나 짝수이면 true
//			System.out.println(num%2==0||num<0);
		
//		 [4] | (OR연산자): 둘중 하나라도 1이면1.
//		 ex) sysout(0b0001|0b0011) //
//		 ex) sysout(1|3) //
		
//		 [5] ! (NOT연산자): 뒤집어(true ->false / false -> true)
//		 ex) sysout(!false) // true
//		 ex) sysout(!true) // false
//		 ex) int num = 10;
//		 	 sysout(num <=5||num>=15)// false
//			 sysout(!(num <=5||num>=15))//true
//		 연습 num 이 10보다 작으면서 2또는 3또는 7이 아니라면 true
//		 sysout((num<10)&&(num!=2&&num!=3&&num!=7))
		
//		드모르간 법칙 : 각조건을 부정하고 and -> or (or -> and)하고
//		다시 전체를 부정한 것은 -------------> 원래의 조건과 같다.
//		--> num<10 && !(num==2||num==3||num==7)
		
//		연습2 num이 2 또는 3또는 7이거나, 5보다 큰수이면 true
//		-=---> (num이 2또는 3또는 7) || (num이 5보다 큰수)
//		sysout(num ==2 || num ==3 || num ==7)
		
//		연습3 num이 짝수이면서 일의 자리가 6이상이면 true
//		num 이 짝수 && num 의 일의 자리가 6이상 
		
//		[6] ~(NOT 연산자): 뒤집어 (1->0 , 0->1)
//		[7]^(XOR.exclusive-OR '배타적논리합'):"둘이 달라야 true"
//		(진리표)  true ^ true: false
//				true ^ false: true
//				false ^ true: true
//				false ^false: false
//		[8] ^(XOR연산자): 둘이 달라야 1
//			(진리표)  1^ 1 : 0
//					1^ 0: 1
//					0^ 1: 1
//					0^ 0: 0
	}

}
