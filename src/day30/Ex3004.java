package day30;

public class Ex3004 {
	static void m() throws Exception{
//		try {
			throw new Exception("무언가 메시지 아무거나!"); //checked Exception
//		} catch(Exception e) {
//			System.out.println("예외를 처리함.");
//		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println("실행시작");
//		try {
			m();
//		}catch(Exception e) {
//			System.out.println("main()에서 처리됨.");
//		}
		System.out.println("실행끝.");
	}

}
