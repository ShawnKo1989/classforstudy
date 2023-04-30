package day9;

public class Ex905 {

	public static void main(String[] args) {
//		피보나치 수열 
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.print(a + " "); // 첫째항출력
		System.out.print(b + " "); // 두번째 출력
		for(int i=1; i<=8;i++) {
			c = a + b;
			System.out.print(c+ " ");
			a = b;
			b = c;
		}
	}

}
