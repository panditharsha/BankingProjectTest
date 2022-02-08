package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_Hashset {

	public static void main(String[] args) {
	  HashSet hs =new HashSet<>();
	  
	  hs.add("Harshada");
	  hs.add("pia");
	  hs.add(50);
	  hs.add("Velocity");
	  hs.add(130);
	  
	 System.out.println( hs.add(50));  //no duplicate
	 System.out.println(hs.add("game"));  
	 hs.add(null);
	 System.out.println(hs.add(null));    //single null values only
	 
	 hs.remove("pia");
	 hs.remove(50);
	 hs.remove(null);
	 
	 
	  
	 System.out.println(hs);
	 
	 System.out.println(hs.size());
	 System.out.println(hs.contains(130));
	 
	 
	 System.out.println("******************* //Using Iterator****************************************");
	
	 Iterator it =hs.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	 
	 System.out.println("******************* //Using for Each****************************************");
     
	 for(Object o:hs)
	 {
		System.out.println(o); 
	 }
	 
	 
	
	 
	}

}
