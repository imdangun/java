package ch07.ex08.case04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colon {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("최한석"), 
				new User("한아름"), 
				new User("양승일"));
		
		users.forEach(user -> System.out.print(user)); // 최한석한아름양승일
		System.out.println(); 
		
		users.forEach(System.out::print); // 최한석한아름양승일
		System.out.println();
		
		//
		Colon colon = new Colon();
		users.stream().map(user -> colon.addTitle(user))
			.forEach(System.out::print); // 최한석님 한아름님 양승일님
		System.out.println();
		
		users.stream().map(colon::addTitle)
			.forEach(System.out::print); // 최한석님 한아름님 양승일님
		System.out.println();
		
		users.stream().map(Colon::addHonor)
			.forEach(System.out::print); // 최한석씨 한아름씨 양승일씨
		System.out.println();
		
		//
		List<String> userNames = Arrays.asList("최한석", "한아름", "양승일");
		users = userNames.stream()
				.map(userName -> new User(userName))
				.collect(Collectors.toList());
		System.out.println(users); // [최한석, 한아름, 양승일]
		
		users = userNames.stream()
				.map(User::new)
				.collect(Collectors.toList());
		System.out.println(users); // [최한석, 한아름, 양승일]
		
	}
	
	public String addTitle(User user) {
		return user + "님 ";
	}
	
	public static String addHonor(User user) {
		return user + "씨 ";
	}
	
}
/*
:: method reference expression
*/