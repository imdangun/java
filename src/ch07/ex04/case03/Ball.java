package ch07.ex04.case03;

public class Ball {
	private int ballNum;
	
	public Ball(int ballNum) {
		this.ballNum = ballNum;
	}
	
	@Override
	public String toString() {
		return this.ballNum + " ";
	}
}
