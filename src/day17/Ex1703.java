package day17;

public class Ex1703 {
	static int fibo(int n) {	// 피보나치 수열의 n번째항을 리턴
		if(n==1 || n==2)
			return 1;
		return fibo(n-1)+ fibo(n-2);
	}
	public static void main(String[] args) {
//		피보나치 수열 
//		1) 반복문 사용은 이미 알고있음.
//		2) 재귀호출 사용 (easy)
		for(int i =1; i<=20; i++) {
			System.out.print(fibo(i) + " ");
		}// 20번째항까지 출력.
		
		
		
	}

}
