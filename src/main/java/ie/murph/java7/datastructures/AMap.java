package main.java.ie.murph.java7.datastructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class AMap {

	public HashMap<Character, String> createHashMap(){
		return new HashMap<Character, String>();
	}
	
	public void populateHashMap(Map<Character, String> l_map) {
		l_map.put('A', "Apple");
		l_map.put('D', "Dog");
		l_map.put('B', "Ball");
	}

	public TreeMap<Character, String> createTreeMap(){
		return new TreeMap<Character, String>();
	}
	
	public void populateTreeMap(Map<Character, String> l_map) {
		l_map.put('B', "Ball");
		l_map.put('E', "Electricity");
		l_map.put('C', "CAble");
	}
	
	public Hashtable<Character, String> createHashtable(){
		return new Hashtable<Character, String>();
	}
	
	public void populateHashTable(Hashtable<Character, String> l_hashTable) {
		l_hashTable.put('P', "Purple");
		l_hashTable.put('O', "Otter");
		l_hashTable.put('Q', "Queen");
	}
	
	public void printMap(Map<Character, String> l_map) {
		l_map.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue()); 
		 });
	}
	
	public void convertToHashCOde(Map<Character, String> l_map){
		System.out.println("Hashcode: " + l_map.hashCode());
	}
}
