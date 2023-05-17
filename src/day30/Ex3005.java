package day30;

public class Ex3005 {

	public static void main(String[] args) {
		try {
		int a = 5; 
		int b = 0;
		System.out.println(a+"를 "+b+" 로 나누면: "+(a/b)+"!");
		}catch(ArithmeticException e) {
			e.printStackTrace();	//내가 빨간글을 띄움
		}finally {	//(ㄴ마지막으로 "무조건" 실행하는 영역)
			System.out.println("FINALLY");
		}
		System.out.println("실행끝.");
		
	}

}
