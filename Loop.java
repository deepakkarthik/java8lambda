package com.example.demo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Loop {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		
		l.add(0);
		l.add(100);
		l.add(20);
		l.add(19);
		l.add(10);l.add(10);
		l.add(1);

		System.out.println(l);
		
//		Collections.sort(l);
//		
//		System.out.println(l);
		for (Integer i:l) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		

		System.out.println("=========================");
		
		int j=0;
		
		while(j<l.size()) {
			System.out.println(l.get(j));
			j++;
			
		}
		System.out.println(l.lastIndexOf(2));
		
		System.out.println(l.get(1));
		
		HashSet<Integer> s=new HashSet<>(l);
		
		System.out.println(s);
		
		TreeSet<Integer> ts=new TreeSet<>(l);
		System.out.println(ts);
		
		
		
	}

}
