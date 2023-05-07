package practice;

public class Prac02 extends Prac01 {
	String c = "test String2";
	int d = 12354678;
	void m() {
		System.out.println(b+d);
	}
	public static void main(String[] args) {
		Prac02 p2 = new Prac02();
		System.out.println(p2.a);
		System.out.println(p2.b);
		System.out.println(p2.c);
		System.out.println(p2.d);
		p2.m();
	}
}
