package com.ibm.juint.junit5;

public class Calculator {
	
	public int sum(int inum1,int inum2) {
		return inum1+inum2;
	}
	public int divide(int num1,int num2) {
		return num1/num2;
	}
	
	public static boolean isEven(int num) {
		return num%2 ==0;
	}
	public void getConnection() throws InterruptedException {
		Thread.sleep(10);
		System.out.println("connected.....");
	}

}
