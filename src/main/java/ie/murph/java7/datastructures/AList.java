package main.java.ie.murph.java7.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AList {
	
	private List<String> list;
	
	public static void main(String[] args){
	}
	
	public void createStringArrayList(){
		list = new ArrayList<String>();
	}
	
	public void createStringLinkedList(){
		list = new LinkedList<String>();
	}
	
	public void createStringVector(){
		list =  new Vector<String>();
	}
	
	public List<String> getStringArrayList(){
		return new ArrayList<String>();
	}
	
	public List<String> getStringLinkedList(){
		return new LinkedList<String>();
	}
	
	public List<String> getStringVector(){
		return new Vector<String>();
	}

}
