package day21;

import java.util.Random;

class Rectangles{
	int width;
	int height;
	static int cnt;
	Rectangles(int width, int height){
		this.width = width;
		this.height = height;
		cnt++;
	}
	void showArea () {
		int area = width * height;
		System.out.println("가로가"+width+", 세로가"+height+"인 직사각형의 넓이는"+area+"입니다.");
	}
	static void showCount() {
		System.out.println("지금까지 생성된 객체의 수는 "+cnt+"개 입니다.");
	}
	
}
public class Q2103practice {

	public static void main(String[] args) {

//			Q2103.	직사각형 정보를 가지고 있는 Rectangle 클래스를 정의:
//			- 인스턴스변수 : width(가로), height(세로)
//			- 클래스변수 : cnt(지금까지 생성된 객체의 수)
//			- 인스턴스메서드 : showArea() - 아래와 같이 출력:
//	  		"가로가 ___, 세로가 ___인 직사각형의 넓이는 ____입니다."
//			- 클래스메서드 : showCount() - 아래와 같이 출력:
//	 		 "지금까지 생성된 객체의 수는 ____개입니다."
//			- main()에서,
//	  		난수발생(가로, 세로 각각 1~10)해서
//	  		Rectangle객체를 2개 생성. (참조변수 r1, r2)
//	  		r1의 showArea() 호출
//	  		r2의 showArea() 호출
//		  	클래스메서드 showCount() 호출.
		Rectangles[]arr = new Rectangles[3];
		Random rd = new Random();
		for(int i = 0; i<=arr.length-1; i++) {
			int a = rd.nextInt(10)+1;
			int b = rd.nextInt(10)+1;
			
			arr[i]= new Rectangles(a,b);
		}
		for(int i=0; i<=arr.length-1; i++) {
			arr[i].showArea();
		}
		for(Rectangles reat : arr) {
			reat.showArea();
		}
		Rectangles.showCount();

	}

}
