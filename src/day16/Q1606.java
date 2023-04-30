package day16;

public class Q1606 {
	static boolean isPrime(int a) {
		boolean b = false;
		int count =0;
		for(int i=1; i<=a; i++) {
			if(a%i==0) count ++;
		}
		if(count == 2) {
			b = true;
		}
		return b;
	}
	public static void main(String[] args) {

//		Q1606) isPrime 메서드를 정의.
//			- 파라미터 : 정수 1개.
//			- 리턴 : true(소수인 경우) / false(소수가 아닌 경우)
//			main():
//			- for(int i=1; i<=100; i++) {
//			-    if(isPrime(i)) 
//			-        System.out.print(i + " ");
//			- }
		for(int i=1; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
				
		}


	}

}
