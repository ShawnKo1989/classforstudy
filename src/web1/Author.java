package web1;

public class Author{
	String name;
	String email;
	char gender;
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	String getName() {
		return "고승우";
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	char getGender() {
		return 'M';
	}
	public String toString() {
		return getName()+"("+getGender()+") at "+getEmail();
	}
}