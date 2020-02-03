package com.example.demo;

public class TestMyDefaultInterrface implements MyDefaultInterrface {

	public static void main(String[] args) {
		TestMyDefaultInterrface t=new TestMyDefaultInterrface();
		//default method in function interface
		
		t.ourMsg();
		System.out.println(t.add(4, 5));
		
		//lambda expersion in function interface
		MyDefaultInterrface lambda=()->System.out.println("hi deepak");
		
		lambda.msg();
		
		//static method in function interface
		System.out.println(MyDefaultInterrface.mul(4, 2));
		

	}

//	@Override
//	public void ourMsg() {
//		System.out.println("overrided msg");
//	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
