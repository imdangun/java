package ch05.ex01.case03;

public class User {
	private String userName;   // encapsulation
	private int age;
	
	public String getUserName() { // getter
		return userName;
	}
	
	public void setUserName(User this, String userName) { // setter
		this.userName = userName;
	}
	
	public int getAge(User this) {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}	
}