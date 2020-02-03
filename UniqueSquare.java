package com.example.demo;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 17);
		listOfPrimes.stream().forEach((i) -> { System.out.println(i); });
		
		
		List<Integer> unique = Arrays.asList(0,0,2, 3,2,4,4,7, 5, 7, 11, 3, 17);
		System.out.println(unique);
		
		List<Integer> newunique=unique.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newunique);
		
		

		

	}

}
