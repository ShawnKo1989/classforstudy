package practice;

public class MakeThreadMultiDemo {

	public static void main(String[] args) {
		Runnable task1 = () -> {
			try {
				for(int i = 1; i<=20; i++) {
					if(i % 2 == 0) {
						System.out.println(i + " ");
						Thread.sleep(1000);
					}
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		};
		Runnable task2 = () -> {
			for(int i = 1; i<=20; i++) {
					try {
						if(i % 2 == 1) {
							System.out.println(i + " ");
							Thread.sleep(1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.run();
		t2.run();
		
	}

}
