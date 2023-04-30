package hongongja;

public class ShopserviceExample{
	private static ShopserviceExample ssv = new ShopserviceExample();
	private ShopserviceExample() {}
	
	static ShopserviceExample getInstance() {
		return ssv;
	}
	
}