package pkg_1;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
var list = new LinkedList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.2);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		//System.out.println(list.get(2));
		//list.set(2, 3.3);
		//System.out.println(list.get(2));
		//list.add(3, 9.8);
		//list.clear();
		//list.remove(0);
		//list.remove(1.6);
		
		//System.out.println(list.indexOf(1.99));
		//System.out.println(list.lastIndexOf(1.2));
		//System.out.println(list.contains(90.0));
		
		//System.out.println(list.peekFirst());
		//System.out.println(list.peekLast());
		
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		
		System.out.println(list);
		//System.out.println(list.subList(2, 4));


	}

}
