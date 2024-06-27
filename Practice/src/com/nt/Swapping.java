package com.nt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Swapping {
	public static void main(String[] args) {
	List<Map<String,Integer>> list=new ArrayList<>();
	
	Map<String,Integer> m1=new HashMap<String, Integer>();
	m1.put("data1", 1);
	m1.put("data2", 2);
	
	Map<String,Integer> m2=new HashMap<String, Integer>();
	m2.put("data3", 3);
	m2.put("data4", 4);
	
	list.add(m1);
	list.add(m2);
	
	for(Map<String,Integer> data:list) {
		System.out.println("Map:");
		for(Map.Entry<String,Integer> abc:data.entrySet()) {
			System.out.println(abc.getKey()+" "+abc.getValue());
		}
		System.out.println();
		
		
		List<Map<String, Integer>> mapList = new ArrayList<>();

        // Create some Maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("X", 10);
        map2.put("Y", 20);

        // Add the Maps to the List
        mapList.add(map1);
        mapList.add(map2);

        // Display the contents of the List
        for (Map<String, Integer> map : mapList) {
            System.out.println("Map:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
		
		
		
		
		
		
		
	}
	}
	}
}
	
