package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet ls =new LinkedHashSet<>();
	
		ls.add("sia");
		ls.add(400);
		ls.add("Pune");
		ls.add(640);
		ls.add(null);             //one null
		
		
		System.out.println(ls.add(400));  //no Duplicate
		System.out.println(ls.add(null));  //no Duplicate Null
		System.out.println(ls.contains("sia"));
		
		
		System.out.println(ls);
		
		 System.out.println("******************* //Using Iterator****************************************");
			
		 Iterator it =ls.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 
		 System.out.println("******************* //Using for Each****************************************");
	     
		 for(Object o:ls)
		 {
			System.out.println(o); 
		 }
		 
		
		
	}

}
