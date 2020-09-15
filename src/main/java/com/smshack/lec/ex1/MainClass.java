package com.smshack.lec.ex1;

public class MainClass {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.setFirstNum(10);
		cal.setSecondNum(2);
		
		cal.add();
		cal.sub();
		cal.mult();
		cal.div();
	}
}
