package day17;
public class Ex1704 {
	static void m() {
		int num = 5;
	}
	static void m2(int a) {  // �Ķ���� int a�� ���������̴�.
		System.out.println(a);
//		System.out.println(num); 
//		ERR
//		System.out.println(num2);
//		ERR
	}
	public static void main(String[] args) {
		for(int i = 1; i<=3; i++) {
			//for ���� ��ȣ () �ȿ��� ����� int i�� �ش� for�� �ȿ����� �������.
		}
//		System.out.print(i + " "); //4 ERR
		
//		�޼��� �߰�ȣ ���� ����� ������ �ش� �޼��� �ȿ����� �������.
		m();
//		System.out.println(num); // ERR
		
		// if���� �߰�ȣ �ȿ��� ����� ������ �ش� �߰�ȣ �ȿ����� ����ִ�.
		if(1==1) {
			int num2 = 55; 
		}
//		System.out.println(num2); ERR �߰�ȣ �ȿ��ִ� �����̴�.
		
//		�޼����� �Ķ����(parameter)�� ���������̴� !!! �߿�!!!
//		---> �ش� �߰�ȣ �ȿ����� ����մ�.
		m2(555);
//		System.out.println(a); ERR 
		
	}

}
