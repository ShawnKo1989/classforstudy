package day17;

public class Ex1702 {
	static int f(int n) {
		if(n==0)
			return 1;
		return n* f(n-1);
	}
	public static void main(String[] args) {
		//���ȣ��(�⺻) : factorial ���丮��
		// 5! = 5*4*3*2*1 ex)
		System.out.println("4! = " + f(4));
		System.out.println("5! = " + f(5));
//		[����]	- ���ڿ�.length() : ���ڿ��� ����.
//		Ex) String s = "Hello";
//		    sysout(s.length());   // 5
//		- ���ڿ�.charAt(int idx) : �ε��� idx ��ġ�� ����.
//		Ex) sysout(s.charAt(0));  // H
//		    sysout(s.charAt(4));  // o
//		- ���ڿ�.substring(int)
//		Ex) String s2 = s.substring(1);
//				// �ε���#1���� �����ؼ� ������.
//		    sysout(s2);   // ello
//		- ���ڿ�.substring(int, int)
//		Ex) String s3 = s.substring(1,3);
//				// �ε���#1���� �����ؼ�
//				// �ε���#3�� �Ǳ� ������.
//		    sysout(s3);   // el
	}

}
