package com.example.demo;

public class Eg4 {
	
	@FunctionalInterface	
	interface Len{
		public int getLength(String name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		
		Len l=s->s.length();
		
		System.out.println("my name is "+l.getLength("deepak"));
		System.out.println("my name is "+l.getLength("karthik"));
	}

}
