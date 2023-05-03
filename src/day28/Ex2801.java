package day28;
class A{
	void m() {
		
	}
}
class B extends A{
	@Override
	void m() {
		
	}

	@Override 
	public String toString() {
		return "B객체임.";
	}
}
public class Ex2801 {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj);
	}
}
