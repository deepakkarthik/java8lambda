package com.example.demo;

public class Employee {

	public String name;
	public int empNo;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	
	public int nameLength(String s) {
		return s.length();
	}
	
	public void parent() {
		System.out.println("parent");
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + "]";
	}

}
