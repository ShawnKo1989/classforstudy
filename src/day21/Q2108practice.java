package day21;
class NameCard2{
	String name;
	String phone;
	String job;
	NameCard2(String name, String phone, String job){
		this.name = name;
		this.phone = phone;
		this.job = job;
	}
	void show() {
		System.out.println(job + " " +name +", "+ phone);
	}
	
}
public class Q2108practice {

	public static void main(String[] args) {
//		Q2108.	NameCard 클래스 작성.
//		- 인스턴스변수 : String name   // 이름
//			      String phone  // 폰 번호
//			      String job    // 직업
//			      // --> 이 3개의 필드는 모두 생성자 파라미터를 통해서 초기화하기로 함.
//		- 인스턴스메서드 : void show()  // 
//		출력 : "직업 이름, 번호" 형식으로.
//		main()에서,
//			NameCard nameCard = new NameCard("YG", "5595-9500", "Teacher");
//			nameCard.show();   // 출력 : "Teacher YG, 5595-9500"
		NameCard2 namecard = new NameCard2("YG","5595-9500","Teacher");
		namecard.show();
//
	}

}
