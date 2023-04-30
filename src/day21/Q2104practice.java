package day21;
class Rectangle3 {
	int width;
	int height;
	Rectangle3(int width, int height){
		this.width = width;
		this.height = height;
	}
	void showWidth() {
		System.out.print("가로 : "+ width);
	}
	void showHeight() {
		System.out.print("\n세로 : "+ height);
	}
	void showArea() {
		int area = width *height;
		System.out.println("\n넓이 : "+ area);
	}
}
public class Q2104practice {

	public static void main(String[] args) {
//		Q2104.	Rectangle2 클래스 작성.
//		- 인스턴스변수 : int width, height;  // 가로, 세로
//		- 인스턴스메서드 : void showWidth()  // "가로 : ___" 형식으로 출력
//				void showHeight() // "세로 : ___" 형식으로 출력
//				void showArea()   // "넓이 : ___" 형식으로 출력
//		main()에서,
//			Rectangle rect = new Rectangle(10, 5);
//			rect.showWidth();  // "가로 : 10"
//			rect.showHeight(); // "세로 : 5"
//			rect.showArea();   // "넓이 : 50"
		Rectangle3 rect = new Rectangle3(10,5);
		rect.showWidth();
		rect.showHeight();
		rect.showArea();

	}

}
