package com.nt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Demo{
	int id;
	String name;
	String address;
public Demo(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public static void main(String[] args){
	List<Demo> lt = new ArrayList<>();
    lt.add(new Demo(20, "nani", "Hyd"));
    lt.add(new Demo(5, "pani", "vizag"));
    lt.add(new Demo(26, "gani", "Dubai"));
    
   Map<String, List<Demo>> values= lt.stream().collect(Collectors.groupingBy(Demo::getAddress));
   System.out.println(values);
}
}

   