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

//		Q1606) isPrime �޼��带 ����.
//			- �Ķ���� : ���� 1��.
//			- ���� : true(�Ҽ��� ���) / false(�Ҽ��� �ƴ� ���)
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
