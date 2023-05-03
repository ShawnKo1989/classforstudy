package day28;
abstract class Parent{
	abstract void message();
}
class Child1 extends Parent{
	void message() {
	}
}
class Child2 extends Parent{
	void message() {
	}
}

public class Q02 {

	public static void main(String[] args) {
		Parent[] arr = new Parent[5];
		for(int i =0; i<=arr.length-1; i++) {
			int num = (int)(Math.random()*2);
			if(num ==0) {
				arr[i] = new Child1();
			}else if(num ==1) {
				arr[i] = new Child2();
			}
		}
		for (Parent p: arr) {
			p.message();
		}
		
		

	}

}
