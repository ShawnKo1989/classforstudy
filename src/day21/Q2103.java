package day21;
class Rectangle{
	int width;
	int height;
	static int count;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		count++;
	}
	void showArea() {
		int area =  width*height;
		System.out.println("가로가 "+width+"세로가 "+height+"인 직사각형의 넓이는 "+area+"입니다.");
	}
	static void showCount() {
		System.out.println("지금까지 생성된 객체의 수는 "+ count+"개 입니다.");
	}
}
public class Q2103 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		Rectangle r1 = new Rectangle(a,b);
		int a2 = (int)(Math.random()*10)+1;
		int b2 = (int)(Math.random()*10)+1;
		Rectangle r2 = new Rectangle(a2,b2);

		r1.showArea();
		r2.showArea();
		
		Rectangle.showCount();

	}

}
