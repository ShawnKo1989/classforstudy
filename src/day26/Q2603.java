package day26;
class Circle2{
	int radius;
	void setRadius(int r) {
		this.radius = r;
	}
	double getArea() {
		return radius*radius*Math.PI;
	}
}
public class Q2603 {

	public static void main(String[] args) {
//		- 인스턴스변수 : int radius;   // 반지름
//		- ㅅ : (아무 것도 하지 마세요)
//		- 인스턴스메서드 : void setRadius(int r)  // r을 radius에 대입.
//				double getArea()    // 원의 넓이를 리턴.
//
//		main():
//			Circle2 circle = new Circle2();
//			circle.setRadius(10);
//			sysout("원의 넓이 : " + circle.getArea());
//		(실행결과)
//		원의 넓이 : 314.0

		Circle2 circle = new Circle2();
		circle.setRadius(10);
		System.out.println("원의넓이 : " + circle.getArea());
	}

}
