package ch07.ex08.case02;

import java.util.stream.IntStream;

public class Filter {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		
		// true 인 것만을 골라낸다.
		stream.filter(i -> (i % 2) == 0)
				.forEach(System.out::print); //2468
		System.out.println();
		
		// 
		stream = IntStream.range(1, 10);
		stream.filter(i -> i % 2 == 0)
			.map(i -> i * 10)
			.forEach(System.out::print); // 20406080
		System.out.println();		
	}
}
