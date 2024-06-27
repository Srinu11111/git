package com.nt;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int number=sc.nextInt();
		switch(number) {
		case 1   :System.out.println("30");
		        break;
		case 2   :System.out.println("28");
        break;

		case 3   :System.out.println("31");
        break;

		case 4  :System.out.println("31");
        break;

		case 5   :System.out.println("30");
        break;

		default  :System.out.println("30");
        break;

		
		
		
		}

	}

}
