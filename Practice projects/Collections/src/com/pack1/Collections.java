package com.pack1;
import java.util.*;
public class Collections {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> state=new ArrayList<String>();   
	      state.add("Karnataka");//
	      state.add("Andhra");    	   
	      System.out.println(state);  
		
		//*creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(20); 
	      vec.addElement(40); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Arun");  
	      names.add("Varun");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(12);  
	       set2.add(14);  
	       set2.add(16);
	       set2.add(18);	       
	       System.out.println(set2);
	      	} 
	      }  
	}


