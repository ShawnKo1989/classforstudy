package day16;

public class Ex1602 {
	static void sayHello(String param){ //����Ÿ�� X
		System.out.println(param +"��, Hi~");
	}		// �ٽ� �������� ������ ���� �͵��� ���ؼ� void �޼ҵ带 ����Ѵ�.
	static String sayHello2(String param) {
		System.out.print(param); //���ο��� �����ִ� ���ڿ��� �޾Ƽ� ���!!
		return "��, Hi~~"; // �޾��ִ� ��Ʈ�� ������ ����� �ʿ�!!
	}
	public static void main(String[] args) {
		sayHello("YG"); // ��� : YG��. Hi~
		System.out.println(sayHello2("YG")); //���
	}

}
