package main.java.ie.murph.java7.datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ASet { //implements SortedSet<Object>{
	
	private static Set set;

	public static void main(String[] args){
		set = new HashSet();
		set = new LinkedHashSet();
		set = new TreeSet();
	}
}