package day31;
// 첫번째 방식 : "Extends Thread 방식"
// 1) "extends thread" 를 하는 클래스를 정의
// 2) run() 메서드를 오버라이드.
// 3) 객체 생성.
// 4) .start() 호출. (NOT .run())
class MyThread1 extends Thread{
	@Override
	public void run() {		//main 메서드의 기능을 함.(동시에 실행할 코드)
		for(int i= 1; i<=5; i++) {
			System.out.print("A");
			try {
				sleep(1000);		// 1000 --> 1000ms --> 1s(1초)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {		//main 메서드의 기능을 함.(동시에 실행할 코드)
		for(int i= 1; i<=5; i++) {
			System.out.print("B");
			try {
				sleep(1000);		// 1000 --> 1000ms --> 1s(1초)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex3102 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();		//동시진행이 가능한 코드
		t2.start();
//		t1.run();		// 하나씩 진행이 되는 코드
//		t2.run();
		
		try {
			t1.join();		//main-Tread 가 t1(Thread) 가 끝날때까지 기다림.
			t2.join();		//main_Tread 가 t2(Thread) 가 끝날때까지 기다림.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		t1.start();			//스테이트 위반 익셉션으로 걸리게 된다.
//		t2.start();
		
		System.out.println("\n main() 실행 종료됨");
	}

}
