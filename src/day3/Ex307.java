package day3;

// 버스 7728 / 버스 753

public class Ex307 {

	public static void main(String[] args) {
		byte b1 = 127; // 64+ 43 + 16 + 8 + 4 + 2 +1
		byte b2 = (byte)0b1000_0010;
		byte b3 = 0x7F;
		byte b4 = 0177;
		System.out.println(b1 + ", "+ b2 + ", " +b3 + ", "+b4);
		
		
//		Overflow** 고급 
//		0111 1111 8개의 비트에서 가장 첫번째는 MSB (Most Significant Bit)
//		- byte short int long float double ---> MSB가 부호를 표현 0=(+), 1= (-)
//		ex) byte --> MSB 1개 비트가 부호를표현.
//					나머지 7개가 값의 크기를 표현
//		ex) int ---> MSB 1개 비트가 부호를표현.
//					나머지 31개가 값의 크기를 표현.
//		char (표현범위 0 ~65535) ---> MSB가 부호를 표현하는게 아님.
//									MSB를 포함한 16개의 비트가 값을 표현.
		b4++;
		System.out.println(b4);
		
//		진법 변환 연습.
//		연습1.   // 무조건 (+) 값이라고 가정.
//			2진수	   10진수
//			1110 ------> 14
//			10010 -----> 18								
//			1010100 --> 84
//		연습2.
//			10진수	   2진수
//			23 --------> 10111
//			170 -------> 10101010
//			251 -------> 11111011
//		연습3.
//			16진수	10진수	2진수
//			C2 ------>  194	 -> 1100 0010
//			12F -----> 303 -> 100101111
//		연습4.
//			10진수	16진수
//			65 ------> 0x41
//			173 -----> 0xAD
//			257 -----> 0x101
		
		
		
//		12라는 값을 2진수 리터럴/ 8진수 리터럴/ 16진수 리터럴
		System.out.println(0b1100);//12
		System.out.println(014);//12
		System.out.println(0xC);//12
		
		System.out.println(07);//7
		System.out.println(016);//14
		System.out.println(025);//21
	
		System.out.println(0x7);//7
		System.out.println(0xE);//14
		System.out.println(0x15);//21
		
	}

}
