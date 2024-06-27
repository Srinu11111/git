package com.nt;

import java.util.Arrays;

public class DatePrinting {

	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6,7,8,9};	
	
	int[] data=Arrays.stream(a).filter(e->e%3==0).toArray();
	for(Integer values:data) {
		System.out.println(values);
	}



}
}