package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNew2 {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String> ();
		
		s.add("Karthi");
		s.add("Arun");
		s.add("Dev");

		s.add("Selva");

		s.add("Anbu");

		s.add("Sekar");
		System.out.println("listing the element" +s);
		List<String> s1 = new ArrayList<String>();
		for (String name : s) {
			if (name.startsWith("S")) {
				s1.add(name);
				}}
		System.out.println("listing the element" +s1);
		
		
	}
}
