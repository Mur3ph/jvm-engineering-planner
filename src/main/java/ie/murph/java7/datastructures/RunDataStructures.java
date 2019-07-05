package main.java.ie.murph.java7.datastructures;

import java.util.Hashtable;
import java.util.Map;

public class RunDataStructures {

	private static Map<Character, String> map;
	private static Hashtable<Character, String> hashTable;

	public static void main(String[] args){
		AMap aMap = new AMap();
		
		System.out.println();
		
		map = aMap.createHashMap();
		aMap.populateHashMap(map);
		aMap.printMap(map);
		aMap.convertToHashCOde(map);
		
		System.out.println();
		
		map = aMap.createTreeMap();
		aMap.populateTreeMap(map);
		aMap.printMap(map);
		aMap.convertToHashCOde(map);
		
		System.out.println();
		
		hashTable = aMap.createHashtable();
		aMap.populateHashTable(hashTable);
		aMap.printMap(hashTable);
		aMap.convertToHashCOde(hashTable);
	}
	
}
