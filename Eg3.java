package com.example.demo;

public class Eg3 {
	
	@FunctionalInterface	
	interface Square{
		public int sqr(int a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		
		Square s=x->x*x;
		
		System.out.println("my value is "+s.sqr(5));
		System.out.println("my value is "+s.sqr(6));
	}

}
