package com.nt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A {
	public  static void div() {
		
		try {
			
			BufferedReader br=
					new BufferedReader(new InputStreamReader(System.in));
			int a;
			int b;
			while(true) {
				try {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter a number");
					a=Integer.parseInt(br.readLine());
					break;
				}catch(NumberFormatException nfe) {
					System.out.println("Enter correct number");
				}
				System.out.println("hi");
			}
			while(true) {
				try {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter  second number");
					b=Integer.parseInt(br.readLine());
					try {
						
						int c=a/b;
						System.out.println("Result:"+c);
					}catch(ArithmeticException e) {
						System.out.println("Do not pass negative values");
						continue;
					}
					break;
				}catch(NumberFormatException nfe) {
					System.out.println("Enter correct number");
				}
				
			}
			System.out.println("hello");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		A.div();

	}
}