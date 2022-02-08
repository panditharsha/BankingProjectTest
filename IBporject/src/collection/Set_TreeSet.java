package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
		TreeSet t =new TreeSet<>();
		t.add("call");
		t.add("kitten");
		t.add("velocity");
		t.add("sita");
		
		//t.add(50);                           //can add only homogeneous data
		
		//t.add(null);                       //No null allowed
		//System.out.println(t.add("call"));   //No duplicates Allowed
		
		System.out.println(t);
		
		 System.out.println("******************* //Using Iterator****************************************");
			
		 Iterator it =t.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 
		 System.out.println("******************* //Using for Each****************************************");
	     
		 for(Object o:t)
		 {
			System.out.println(o); 
		 }
		 
		
		
	}

}
