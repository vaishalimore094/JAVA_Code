package collections_study;

import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
PriorityQueue pq= new PriorityQueue<>();
		
		pq.add("Pune");
		pq.add("Mumbai");
		pq.add("Nagpur");
		pq.add("Solapur");
		//pq.add(123);--> homogenous data only
		
		System.out.println(pq);// random
		System.out.println(pq.add("Pune"));// Duplicates are allowed
	
		pq.offer("Katraj");// to insert element in priority queue
		
		System.out.println(pq);
		System.out.println(pq.offer("Chinchwad"));
		System.out.println(pq);
		pq.remove();// always removes Head of queue by Default
		System.out.println(pq);
		pq.remove("Mumbai");// removes provided element
		System.out.println(pq);
		System.out.println(pq.poll());// poll--> retrieve and remove Head of queue
		System.out.println(pq);
		System.out.println(pq.element());//element--> only retrieves head and doesnot remove it(throws NoSuchElement if queue is empty)
		System.out.println(pq);
		System.out.println(pq.peek());//peek--> only retrieves head and doesnot remove it (returns Null if Queue is empty)
		
		pq.clear();
		System.out.println(pq);
		//pq.element();
		//pq.peek();
		System.out.println(pq.peek());
		System.out.println(pq);
		

	}




	}


