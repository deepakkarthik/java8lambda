package com.example.demo;

public class Eg2 {
	
	@FunctionalInterface	
	interface Math{
		public void sum(int a,int b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		
		Math m=(x,y)->System.out.println("the sum is="+(x+y));
		m.sum(2, 3);
		m.sum(20, 30);
	}

}
