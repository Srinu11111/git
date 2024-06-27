package com.nt;

public class GreaterThreeNumbers {

	public static void main(String[] args) {
		int a = 10, b = 5, c = 10;

		/*
		 * if(a>b && a>c) { System.out.println("a is Greater"); }else if(b>a && b>c) {
		 * System.out.println(" b is Greater"); }else {
		 * System.out.println("c is Greater"); }
		 */

		if (a > b) {
			if (a > c) {
				System.out.println("a is Greater");
			}
			else {
				System.out.println("c is Greater");
			}
		} else if (b > a) {
			System.out.println("b is Greater");
		} else {
			System.out.println("c is Greater");
		}
	}

}
