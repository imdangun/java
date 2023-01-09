package ch07.ex05.case03;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1);
		System.out.println(list);		
		
		// 과제: list 의 모든 원소를 삭제하라.		
		list.removeAll(list);
		System.out.println(list);
		
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
	}
}
/*
public class Arrays {
    ...
	private static class ArrayList<E> extends AbstractList<E>
		implements RandomAccess, java.io.Serializable {
*/