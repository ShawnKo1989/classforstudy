package day17;

public class Ex1701 {	//���ȣ��(recursive)
	static void m() {
		System.out.println((int)(Math.random()*10)+1);
		m();	//������ ���ѹݺ��� �ǹ��Ѵ�.(Ż�������� �ʿ��ϴ�!!)
	} // �߰�ȣ�� �����鼭 memory �� Stack frame �� �������.
	public static void main(String[] args) {
		m();
		
		// ���ȣ���̶� ?? �޼��� �ȿ��� �ڱ��ڽ��� ȣ���ϴ°��� �ǹ�.
		
	}

}
