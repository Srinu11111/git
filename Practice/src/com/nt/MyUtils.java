package com.nt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyUtils {
	private String name;
	private String roles;

	public MyUtils(String name, String roles) {
		this.name = name;
		this.roles = roles;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRoles(String roles) {
		 this.roles = roles;
	}

	public String getRoles() {
		return roles;
	}
	@Override
	public String toString() {
	    return "MyUtils{name='" + name + "', roles='" + roles + "'}";
	}
	public static void main(String[] args) {
		List<MyUtils> lt=new ArrayList<>();
		lt.add(new MyUtils("srinu","admin"));
		lt.add(new MyUtils("uday","user"));
		
		List values=lt.stream().filter(e->e.getRoles().equals("admin")).collect(Collectors.toList());
	System.out.println(values);
	
	}
}
		
	