package com.example.demo;

public class TestClass implements TestInterface{

	public static void main(String[] args) {
		Employee e1=new Employee("deepak",100);
		System.out.println(e1.empNo+e1.name+e1);
		Employee e2=new Employee();
		e2.setEmpNo(200);
		e2.setName("karthik");
		System.out.println(e2.empNo+e2.name+e2.getEmpNo()+e2.getName()+e2);
		
		
		System.out.println(e2.nameLength("deepak"));

		e2.parent();
		
		EmpInh te=new EmpInh();
		System.out.println(te.nameLength("deepak karthik"));
		te.parent();
		TestClass tc=new TestClass();
		tc.msg();
	}

	@Override
	public void msg() {
		System.out.println("deepak");
		
	}

}
