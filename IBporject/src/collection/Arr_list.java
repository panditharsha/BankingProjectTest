package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arr_list {

	public static void main(String[] args) {
		ArrayList a =new ArrayList<>();
		a.add(15);
		a.add("sam");
		a.add("velocity");
		
		System.out.println(a);
		
		
		System.out.println("************Forward********");

		ListIterator l =a.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		System.out.println("************backward********");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		
	}

}
