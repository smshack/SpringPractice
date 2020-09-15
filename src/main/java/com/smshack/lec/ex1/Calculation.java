package com.smshack.lec.ex1;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add()");
		System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum) );
	}
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub()");
		System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum) );
	}
	public void mult() {
		// TODO Auto-generated method stub
		System.out.println("mult()");
		System.out.println(firstNum+" * "+secondNum+" = "+(firstNum*secondNum) );
	}
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div()");
		System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum) );
	}
}
