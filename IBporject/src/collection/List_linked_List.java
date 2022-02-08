package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_linked_List {

	public static void main(String[] args) {
		LinkedList l =new LinkedList<>();
		
		l.add("kite");
		l.add(50);
		l.add("set");
		l.add(200);
		l.add(null);
		l.add(null);
		l.add(50);
	   
		System.out.println(l);
		System.out.println(l.contains(50));
		System.out.println(l.indexOf(200));
		System.out.println(l.size());
		
		l.add(3, "drum");
		l.remove(null);
		System.out.println(l);

		
		
		
		System.out.println("***************Using for Each**********");
		
		for(Object o:l)
		{
			System.out.println(o);
		}
		
		System.out.println("***************Using Iterator Forward***************");
		ListIterator li =l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		System.out.println("***************Using Iterator backward***************");
	
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}

	
				
	}

}
