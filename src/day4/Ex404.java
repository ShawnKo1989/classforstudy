package day4;

public class Ex404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0b0001 & 0b0011);//1
		System.out.println(1 & 3); //1
//		System.out.println(1 && 3);// ERR
		
		int a = 2;
		System.out.println((a-1)& (a+1)); //1	
		
		
		//  ~연산자 (비트연산자) 고급 
		byte b = 0b00000111;
				// 00000000 00000000 00000000 00000111
		System.out.println(~b);
		
		//고오급
		byte b2 = (byte)0b11110111;
		System.out.println(~b2);
	
		// 문자열로 저장된 값을 숫자로 다시 저장 하고싶을때 쓰는 조건식.
		// int n =  "55";
		// int n = Integer.parseInt("55");
	
	
	}

}
