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
//		Q1604) max3 �޼��带 ����.
//		- �Ķ���� : 3���� ���� ��(a, b, c)    // �ߺ��� ���� ���� �־��.
//		- ���� : a, b, c �� ���� ū ��.
//		main():
//		- �����߻�(1~9)	--> 3���� ������ �����߻��ؼ� n1,n2,n3
//		- sysout( max3(n1,n2,n3) );
		
		int n1= (int)(Math.random()*9)+1;
		int n2= (int)(Math.random()*9)+1;
		int n3= (int)(Math.random()*9)+1;
		
		System.out.println(max3(n1,n2,n3));

	}

}
