package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 class Product {
	  private String id;  
      private String pname;  
      private int qty;  
      private double price;  
      private double totalPrice;
	public Product(String id, String pname, int qty, double price, double totalPrice) {
		super();
		this.id = id;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	   public static void displayFormat()   
       {  
           System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
           System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
           System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
       }  
          
       // display  
       public void display()   
       {  
           System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qty, price, totalPrice);  
       }  
 }
	
			
		