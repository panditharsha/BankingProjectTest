package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class List_VectorUse{

	
	public static void main(String[] args) {
		
		Vector v =new Vector<>() ;
		
		
		
		v.add("Velocity");
		v.add(1, "vaishanv");
		v.add("Akshay") ;
		v.add(3, "Sam");
		v.add(50);
		v.remove(4);
		System.out.println(v);
		
		System.out.println("***********Using For Loop*********");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
			
		
		System.out.println("*********FOR Each Loop**********");
		for(Object o:v)
		{
			System.out.println(o);
		}
		
		
		System.out.println("*********Enumeration**********");
		Enumeration e =v.elements() ;
		
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			
			
		System.out.println("*********FOR ListIterator**********");
	
		ListIterator li =v.listIterator();
		
		  while(li.hasNext())
		  {
			  System.out.println(li.next());
		  }
		  
		  
		  System.out.println("************For Backword***********");
		  while(li.hasPrevious())
		  {
			  System.out.println(li.previous());
		  }
		  
		  
		
		
		

		
	}

}
