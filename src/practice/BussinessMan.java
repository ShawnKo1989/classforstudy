package practice;
class Man {
	String name;
	public Man(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("My name is "+ name);
	}
}
public class BussinessMan extends Man{
	String company;
	String position;
	public BussinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		tellYourName();
		System.out.println("My company is "+ company);
		System.out.println("My position is "+ position);
	}
}
