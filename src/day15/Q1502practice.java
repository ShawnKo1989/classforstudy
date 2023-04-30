package day15;

public class Q1502practice {
	static void showAdd(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	static void showSub(int a ,int b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}
	static void showMul(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
	}
	static void showDiv(int a, int b) {
		System.out.println(a+"/"+b+"="+(a/b));
	}
	public static void main(String[] args) {
//		연습2(Q1502).
//		- main() :
//		showAdd(5, 3);    // "5 + 3 = 8"
//		showSub(5, 3); 	  // "5 - 3 = 2"
//		showMul(3, 4);    // "3 * 4 = 12"
//		showDiv(5, 4);    // "5 / 4 = 1.25"
	
		showAdd(5,3);
		showSub(5,3);
		showMul(3,4);
		showDiv(5,4);
	}

}
