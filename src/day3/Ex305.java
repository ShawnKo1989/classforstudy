package day3;

public class Ex305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[고급]
		byte b = 3;
//		int 보다 작은정수형 변수에 값을 대입할때,
//		int 는 해당 형으로 자동 형변환됨
//		EX. byte b= 3;
		byte b2 = 5;
		byte b3 =  (byte)(b + b2); // 그러므로 강제 형변환이 필요한것!
//		[고급]
//		int보다 작은 정수형 변수들 간에 +-
//		*/ % 연산의 결과는 int (int 로 자동 형변환 후 연산자 실행됨.)
		
		char ch = 'A';
		char ch2 = (char)(ch + 32);
		System.out.println(ch2);
		
		
	}

}
