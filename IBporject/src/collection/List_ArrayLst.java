package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_ArrayLst {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();           //Generic data type 
		
		
		//ArrayList<String>al1 =new ArrayList<String>(); //for String DataType
		
		
		al.add("Harsha") ;
		al.add(1,25);
		al.add("ComputerEngg") ;
		al.add("Kavya") ;
		al.add(80);
		al.add(50);
		al.add("Pune");
		al.add(4, "sia");
		al.remove(4);
		al.add(null);
		al.add("Harsha");
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Ram"));
		System.out.println(al.contains("sia"));
		
		al.remove(2);
		al.remove(3);
		al.remove(0);
		System.out.println(al.indexOf("Pune"));
		System.out.println(al.get(1));
		System.out.println(al.size());
		
		
		System.out.println("*********For loop**********");
		
		for(int i =0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
	
	
		
		System.out.println("*********FOR Each loop**********");
		for(Object o:al)
		{
			System.out.println(o);
		}
		

		System.out.println("*********FOR listIterator Previous**********");
		ListIterator li =al.listIterator();
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
		
		
		
		
		
		

	}

}
