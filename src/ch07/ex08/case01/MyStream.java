package ch07.ex08.case01;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		Stream<Integer> stream = list.stream();	// 1 2 3		
		
		Integer[] arr = {1, 2, 3};		
		stream = Arrays.stream(arr); // 1 2 3		
		stream = Arrays.stream(arr, 1, 3); // index 1 이상 3미만 // 1 2		
		
		stream = Stream.<Integer>builder()
					.add(1)
					.add(2)
					.add(3)
					.build(); // 1 2 3
		
		stream = Stream.iterate(1, i -> i + 1).limit(3); // 1 2 3		
		
		stream = Stream.generate(() -> 1).limit(3); // 1 1 1
		
		stream.forEach(System.out::println);
		
		//
		IntStream stream2 = IntStream.range(1, 4); // 1 2 3
		stream2 = "abc".chars(); // 97 98 99		
		stream2.forEach(System.out::println); 
		
		//
		Stream<String> stream3 = Pattern.compile(",").splitAsStream("cat,dog,lion");
		stream3.forEach(System.out::println); // cat dog lion		
	}
}
