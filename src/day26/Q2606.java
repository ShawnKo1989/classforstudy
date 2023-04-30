package day26;

class Car{
	int plate;
	String color;
	String model;
	void setPlate(int plate) {
		this.plate = plate;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setModel(String model) {
		this.model = model;
	}
	void showCar() {
		System.out.println(model+"("+color+"), 차량번호 "+plate);
	}
}
public class Q2606 {

	public static void main(String[] args) {
//		- 인스턴스변수 : int plate(번호판) 
//		/ String color(색상) / String model(모델명)
//		- ㅅ : (아무 일도 하지 마세요)
//		- 인스턴스메서드 : 
//			void setPlate(____)  // 파라미터의 값을 필드 plate에 대입
//			void setColor(____) 
//			void setModel(____) 
//			void showCar()   // 출력 : "Car 객체 : 모델 A(blue),
//								차량번호 1234"
//
//		main() : Car 객체 3개를 생성 후 각 set~~~~()
//		메서드들을 사용하여 아래와 같이 필드 값들을 셋팅:
//			(객체1) 	1234, "blue", "모델 A"
//			(객체2)	5678, "white", "모델 B"
//			(객체3)	9012, "red", "모델 C"
//
//		각 객체에 대해 showCar() 호출해서 출력:
//		(실행결과)
//			Car 객체 : 모델 A(blue), 차량번호 1234
//			Car 객체 : 모델 B(white), 차량번호 5678
//			Car 객체 : 모델 C(red), 차량번호 9012
		Car obj = new Car();
		obj.setPlate(1234);
		obj.setColor("blue");
		obj.setModel("모델A");
		Car obj2 = new Car();
		obj2.setPlate(5678);
		obj2.setColor("white");
		obj2.setModel("모델B");
		Car obj3 = new Car();
		obj3.setPlate(9012);
		obj3.setColor("red");
		obj3.setModel("모델C");
		
		obj.showCar();
		obj2.showCar();
		obj3.showCar();
		
	}

}
