package day30;
//package 선언 = 이 파일이 속한 패키지를 명시
public class Ex3001 {
	static void m() throws ArrayIndexOutOfBoundsException{
		int[] arr = new int[3];
//		try {
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 번호가 잘못됨!");
//		}
		
	}
	public static void main(String[] args) {
		try {
			System.out.println("m()호출전");
			m();
			System.out.println("m()호출후");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("main()에서 처리됨.");
		}catch(NullPointerException e) {
			System.out.println("ksldjflksdf");
		}catch(ClassCastException e) {
			System.out.println("dfsdfsdf");
		}catch(Exception e) {
			System.out.println("안전빵");
		}
		System.out.println("실행끝");
	}

}
