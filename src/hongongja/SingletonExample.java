package hongongja;

public class SingletonExample {
	public static void main(String args[]) {
		/*
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		 */
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 ==obj2) {
			System.out.println("같은 싱글톤 객체임");
		}else {
			System.out.println("다른 singleton 객체임");
		}
	}
}
