package com.example.demo;

import java.util.ArrayList;

import java.util.stream.Collectors;

public class MyStream {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(10);
		l.add(55);
		l.add(9);
		l.add(40);
		l.add(112);
		l.add(10);

		System.out.println(l);

		// ArrayList<Integer> l2=new ArrayList<>();

		ArrayList<Integer> l2 = (ArrayList<Integer>) l.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(l2);

		ArrayList<Integer> l3 = (ArrayList<Integer>) l.stream().map((i->i*2)).collect(Collectors.toList());

		System.out.println(l3);
		
		long count= l.stream().filter(x -> x % 2 == 0).count();
		System.out.println("count="+count);
		
		ArrayList<Integer> l5 = (ArrayList<Integer>) l.stream().distinct().collect(Collectors.toList());
		
		System.out.println(l5);
	}

}
