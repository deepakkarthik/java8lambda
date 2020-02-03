package com.example.demo;

@FunctionalInterface
public interface MyDefaultInterrface {

	void msg();

	default void ourMsg() {
		System.out.println("default msg");
	}

	default int add(int a, int b) {
		return a + b;
	}

	public static int mul(int a,int b) {
		return a*b;

}
}