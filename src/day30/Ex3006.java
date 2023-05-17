package day30;

public class Ex3006 {
	static int m() {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			return c;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally 실행됨");
		}
		return 0;
	}
	public static void main(String[] args) {
		int n = m();
		System.out.println("n : "+ n);
	}

}
