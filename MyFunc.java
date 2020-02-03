package com.example.demo;

import java.util.function.*;
public class MyFunc {

	public static void main(String[] args) {
		
		Function<String,Integer> myLen = s->s.length();  
		
		System.out.println(myLen.apply("deepak"));
		System.out.println(myLen.apply("karthik"));
		
	}

}
