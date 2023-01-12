package ch07.ex08.case05;

public record Dog(String dogName, int age) {
	public static void print(String dogName, int age) {
		System.out.printf("My dog %s is %d old.\n", dogName, age);
	}
}
