package main.java.ie.murph.java7.datastructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class AMap {

	private static Map<Character, String> map;
	private static Hashtable<Character, String> hashTable;

	public static void main(String[] args){
		AMap aMap = new AMap();
		
		map = aMap.createHashMap();
		map.put('A', "Apple");
		map.put('D', "Dog");
		map.put('B', "Ball");
		System.out.println(map.hashCode());
		map.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
		
		map = aMap.createTreeMap();
		map.clear();
		map.put('B', "Ball");
		map.put('E', "Electricity");
		map.put('C', "CAble");
		System.out.println(map.hashCode());
		map.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
		
		hashTable = aMap.createHashtable();
		hashTable.put('P', "Purple");
		hashTable.put('O', "Otter");
		hashTable.put('Q', "Queen");
		System.out.println(hashTable.hashCode());
		hashTable.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
	}
	
	private HashMap<Character, String> createHashMap(){
		return new HashMap<Character, String>();
	}
	
	private TreeMap<Character, String> createTreeMap(){
		return new TreeMap<Character, String>();
	}
	
	private Hashtable<Character, String> createHashtable(){
		return new Hashtable<Character, String>();
	}

}
