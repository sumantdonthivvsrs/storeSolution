package com.vvsrs.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stores = new int[] {6,8,4,5,7};
		int[] houses = new int[] {1,3,5};
		
		Map<Integer,Integer> maps = new HashMap<Integer, Integer>();
		
		Arrays.sort(stores);
		Arrays.sort(houses);

		
	    for(int i=0;i<houses.length;i++) {
	    	int oldDistace = 0;
	    	int store = 0;
	    	for(int j=0;j<stores.length;j++) {
	    		
	    		int newdistance;
	    		
	    	    newdistance = houses[i]-stores[j];
	    	    if(j==0) {
	    	    	oldDistace = Math.abs(newdistance); 	
	    	    	store = stores[j];
	    	    }
	    	    if(Math.abs(newdistance) < oldDistace) {
	    	    	oldDistace = Math.abs(newdistance);
	    	    	store = stores[j];
	    	    }
	    	}
	    	maps.put(houses[i], store);
	    	
	    }
	    
	    for(Map.Entry<Integer, Integer> mapvalue : maps.entrySet()) {
	    	
	    	System.out.println("House::"+mapvalue.getKey());
	    	System.out.println("Store::"+mapvalue.getValue());
	    	
	    }
	    
	      

	}

}
