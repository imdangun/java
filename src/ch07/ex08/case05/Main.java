package ch07.ex08.case05;

public class Main {
	public static void main(String[] args) {
		LamdaDog lamdaDog1 = Dog::print;
		LamdaDog lamdaDog2 = (dogName, age) -> 
			System.out.printf("내 강아지 %s는 %d살입니다.", dogName, age);
		
		lamdaDog1.print("walwali", 2);
		lamdaDog2.print("콩콩이", 3);
	}
}
