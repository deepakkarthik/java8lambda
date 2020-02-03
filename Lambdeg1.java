package com.example.demo;

@FunctionalInterface

interface Deepak{
	public void hi();
}

public class Lambdeg1 {

	public static void main(String[] args) {
		Deepak d=()->System.out.println("hi deepak");
		
		d.hi();
	}
}
