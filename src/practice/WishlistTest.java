package practice;
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 
	
	void buy(Product p) {
		if (money >= p.price) {
			money -= p.price;
			add(p);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	void add(Product p) {
		boolean a = false;
		for(int i =0; i<=cart.length-1;i++ ) {
			if(cart[i]==null) {
				a= true;
				break;
			}
		}
		if(!a) {
			Product[] cart2 = new Product[cart.length*2];
			for(int i=0; i<=cart.length-1;i++) {
				cart2[i] = cart[i];
			}
			cart = cart2;
		}else {
			cart[i]=p;
			i++;
		}
		
	}
	void summary() {
		int sum = 0;
		for(int i=0; i<=cart.length-1;i++) {
			System.out.print(cart[i]);
			sum += cart[i].price;
		}
		System.out.println(sum);
		System.out.println(money);
	}
}
class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}
class Tv extends Product {
	Tv() { 
		super(100); 
	}
	public String toString() { 
		return "Tv"; 
	}
}
class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product {
	Audio() { 
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}



public class WishlistTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();

	}

}
