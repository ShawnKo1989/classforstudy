package hongongja;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		// Dmbcellphone 객체생성
		DmbCellphone dmbcellphone = new DmbCellphone("자바폰","검정",10);
		
		//Cellphone 클래스로부터 상속받은 필드
		System.out.println("모델 : "+dmbcellphone.model);
		System.out.println("색상 : "+dmbcellphone.color);
		
		//DmbCellphone 클래스의 필드
		System.out.println("채널 : "+dmbcellphone.channel);
		
		//Cellphone 클래스로부터 상속받은 메소드 호출
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요?");
		dmbcellphone.receiveVoice("안녕하세요 정처산기 A반입니다!");
		dmbcellphone.sendVoice("아~ 예~ 반갑습니다!");
		dmbcellphone.hangup();
		
		//DmbCellphone 클래스의 호출
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
		
	}

}
