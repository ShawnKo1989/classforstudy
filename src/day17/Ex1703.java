package day17;

public class Ex1703 {
	static int fibo(int n) {	// �Ǻ���ġ ������ n��°���� ����
		if(n==1 || n==2)
			return 1;
		return fibo(n-1)+ fibo(n-2);
	}
	public static void main(String[] args) {
//		�Ǻ���ġ ���� 
//		1) �ݺ��� ����� �̹� �˰�����.
//		2) ���ȣ�� ��� (easy)
		for(int i =1; i<=20; i++) {
			System.out.print(fibo(i) + " ");
		}// 20��°�ױ��� ���.
		
		
		
	}

}
