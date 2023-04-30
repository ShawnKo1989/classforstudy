package day16;

public class Q1604 {
	static int max3(int a , int b, int c) {
		int max =0;
		if(a>b&& a>c) max =a; 
		if(b>a&& b>c) max =b;
		if(c>a&& c>b) max =c;
		return max;
	}
	public static void main(String[] args) {
//		Q1604) max3 메서드를 정의.
//		- 파라미터 : 3개의 정수 값(a, b, c)    // 중복이 있을 수도 있어요.
//		- 리턴 : a, b, c 중 가장 큰 값.
//		main():
//		- 난수발생(1~9)	--> 3개의 정수를 난수발생해서 n1,n2,n3
//		- sysout( max3(n1,n2,n3) );
		
		int n1= (int)(Math.random()*9)+1;
		int n2= (int)(Math.random()*9)+1;
		int n3= (int)(Math.random()*9)+1;
		
		System.out.println(max3(n1,n2,n3));

	}

}
