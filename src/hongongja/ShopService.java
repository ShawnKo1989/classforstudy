package hongongja;

public class ShopService {

	public static void main(String[] args) {
		ShopserviceExample obj1 = ShopserviceExample.getInstance(); 
		ShopserviceExample obj2 = ShopserviceExample.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1 과 obj2 는 같은 객체임");
		}else {
			System.out.println("obj1 과 obj2 는 다른객체임");
		}
	}

}
