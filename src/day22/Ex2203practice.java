package day22;
class DD{
	int a;
	void show() {
		System.out.println("a : "+a);
	}
}
class EE extends DD{
	int b;
	@Override
	void show() {
		super.show();
		System.out.println("a : "+a+"b : "+b);
	}
}
class RR extends EE{
	int c;
	@Override
	void show() {
		System.out.println("a:"+a+"b:"+b+"c:"+c);
	}
}
public class Ex2203practice {

	public static void main(String[] args) {
		DD aa = new DD();
		EE bb = new EE();
		RR cc = new RR();
		cc.a = 10;
		cc.b = 20;
		cc.c = 30;
		
		aa.show();
		bb.show();
		cc.show();
	}

}
