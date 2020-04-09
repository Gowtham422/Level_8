package pkg_1;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//List<String> arr1 = new ArrayList<String>();
		
		arr.add("Red");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Yellow");
		arr.add("Pink");
		arr.add("Black");
		arr.add("White");
		arr.add("Purple");
		arr.add("Brown");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(3));
		arr.set(3, "Pink");
		System.out.println(arr.get(3));
		//arr.remove(0);
		//arr.remove("Green");
		//arr.clear();
		System.out.println(arr.indexOf("Pink"));
		System.out.println(arr.lastIndexOf("Pink"));
		System.out.println(arr.contains("White"));
		
		List<String> arr2 = arr.subList(2, 5);
		System.out.println(arr2);
		System.out.println("--------------------");
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println("List Elements:" + arr);
		
		System.out.println("--------------------");
		
		for(String x : arr) {
			System.out.println(x);
		}
		
	}
}
