package ch06.home.ex04.case03;

public class Circle {
	private Point point;
	private int r;
	
	//과제: 위 compile error를 해결토록, 생성자를 기술하라.
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}
