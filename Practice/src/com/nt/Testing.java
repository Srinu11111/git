package com.nt;

import java.util.ArrayList;
import java.util.List;

public class Testing {
	
	public static void main(String[] args) {
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("hello");
				}
				
			}
			
		};
		Thread t=new Thread(r);
		t.start();
	}

}