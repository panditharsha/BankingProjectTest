package collection;

import java.util.PriorityQueue;

public class Queue_Prio_Queue {

	public static void main(String[] args) {
		PriorityQueue pq =new PriorityQueue<>();
		
		pq.add("Pune");
		pq.add("Call");
		pq.add("Sia");
		pq.offer("Velo");                     //add element to queue
		pq.offer("kavya");
		System.out.println(pq);
		
		//System.out.println(pq.peek());      //fetch first elemnt
		//System.out.println(pq.element());    //fetch first record   ......throws exption wen queue is empty
		System.out.println(pq.poll());        //delte first elmnt
		
		
		System.out.println(pq);

	}

}
