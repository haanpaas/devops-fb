package com.arcada.devops.haanpaas.assgn3;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    
    public HashMap<String, String[]> getDataSet() {
    	HashMap<String, String[]> dataSet = new HashMap<String, String[]>();
        
    	dataSet.put("John", new String[] {"Alice","Charlie","Eve"});
    	dataSet.put("David", new String[] {"Liam","Olivia","Eve"});
    	dataSet.put("Bob", new String[] {"Noah","Lotta","Tim"});
    	
    	return dataSet;
    } 
    
    public String[] getFriends(String name) {
    	HashMap<String, String[]> profilePages = getDataSet();
    	return profilePages.get(name);
    }   
      
}
