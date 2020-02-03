package com.example.demo;

import java.util.Scanner;

public class MyInput {
	
	public static void main(String args[]){  
//        Scanner in1 = new Scanner(System.in);  
//        System.out.print("Enter your name: ");  
//        String name1 = in1.nextLine();  
//        System.out.println("Name is: " + name1);             
//        in1.close();    
        
        //===
        
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        String name = in.next();   
        System.out.println("Name: " + name);           
        System.out.print("Enter your age: ");  
        int i = in.nextInt();  
        System.out.println("Age: " + i);  
        System.out.print("Enter your salary: ");  
        double d = in.nextDouble();  
        System.out.println("Salary: " + d);         
        in.close();         
        }  

}
