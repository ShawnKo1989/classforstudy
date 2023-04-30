package day3;

public class Ex302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =3;
		short s= b; // 자동 형변환 O : byte -> short
		int i =s; // 자동 형변환 O  : 
		long lo = i; 
		float f = lo; // 정수 --> 실수 .0이 붙는다.
		double d =f;
		System.out.println(d);
		
		
		
		char ch ='A';
		System.out.println(ch);
		
		char ch2= 65;
		System.out.println(ch2);
		int i2= ch; // 자동 형변환.
		System.out.println(i2);
		
//		char ch3 = 'ABC';//ERR
//		char ch4 = '';//ERR
		//참고
		String s3 = "ABC";
		String s4 = ""; // 빈(empty) 문자열
		
		byte b2 =65;
//		char ch5 = b2; //
//		byte 에서 char 로는 형변환 안됨. 
		
//		자동형변환 : 여부를 따질때, 정보의소실 또는 표현의범위를 고혀
//		강제형변환 : 값앞에 데이터 타입이라고 쓰면됨.
//		실수에서 정수로의 변환은 무조건 소수점을 잃어버린다.
//		ex) int n = (int)6.73 ---> 6
		System.out.println(d);
		int  num = (int)d; //변수의 타입이 바뀌는 게 아님
		
		int num2 = (int)d * 3 ;
		int num3 = (int)(d*3);
		
//		참고
//		자동형 변황 = 묵시적(implicit) 형 변환.
//		강제 형 변환 = 명시적 (explicit)형변환
		
		
	}

}
