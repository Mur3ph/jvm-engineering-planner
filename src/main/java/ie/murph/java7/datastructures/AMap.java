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
		System.out.println(map.hashCode());
		
		map = aMap.createTreeMap();
		map.clear();
		map.put('B', "Ball");
		System.out.println(map.hashCode());
		
		hashTable = aMap.createHashtable();
		hashTable.put('P', "Purple");
		System.out.println(hashTable.hashCode());
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
