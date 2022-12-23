package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// 과제: 아래 compile error 를 해결하라.
		//       byte c 는 건드리지 않는다.
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d);
		
		// 과제: d 변수에 1.5가 저장되도록 하라.
		d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		
		// bad
		d = (double)(a / b);
		System.out.println(d);
		d = a / b * 1.0;
		System.out.println(d);		
	}
}
