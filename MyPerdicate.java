package com.example.demo;

import java.util.function.*;
public class MyPerdicate {

	public static void main(String[] args) {
		
		Predicate<Integer> lesserthan = i -> (i < 18);  
		
		System.out.println(lesserthan.test(100));
		System.out.println(lesserthan.test(10));
		
	}

}
