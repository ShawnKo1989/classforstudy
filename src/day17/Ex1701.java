package day17;

public class Ex1701 {	//재귀호출(recursive)
	static void m() {
		System.out.println((int)(Math.random()*10)+1);
		m();	//일종의 무한반복을 의미한다.(탈출조건이 필요하다!!)
	} // 중괄호가 끝나면서 memory 의 Stack frame 이 사라진다.
	public static void main(String[] args) {
		m();
		
		// 재귀호출이란 ?? 메서드 안에서 자기자신을 호출하는것을 의미.
		
	}

}
