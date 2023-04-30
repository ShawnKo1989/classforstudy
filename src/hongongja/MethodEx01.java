package hongongja;

public class MethodEx01 {
	static void powewOn() {
		System.out.println("전원을 켭니다.");
	}
	static int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	static double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public static void main(String[] args) {
		
		powerOn();
		powerOff();
		
		int a = plus(3,4);
		System.out.println(a);
		
		double b = divide(2,4);
		System.out.println(b);
		
	}

}
