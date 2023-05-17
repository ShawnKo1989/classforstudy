package practice;
class  Counter{
	int count =0;
	
	public void increment() {
		synchronized(this) {	// 동기화 블록 선언
			count++;
		}
		System.out.println("카운터의 값이 1증가 하였습니다.");
	}
	public void decrement() {
		synchronized(this) {		//싱크로나이즈 동기화
			count--;
		}
		System.out.println("카운터의 값이 1감소 하였습니다.");
	}
	public int getCount() {
		return count;
	}
}
public class MutualAccess {
	public static Counter cnt = new Counter();
	public static void main(String[] args) {
		Runnable task1 = () -> {
			for(int i = 1; i<=1000; i++) {
				cnt.increment();
			}
		};
		Runnable task2 = () -> {
			for(int i = 1; i<=1000; i++) {
				cnt.decrement();
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(cnt.getCount());
	}

}
