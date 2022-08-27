package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class UniquePrint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ArunKumar";
		char[] ak = name.toCharArray(); 
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < ak.length; i++) {
			s.add(ak[i]);
		}
		System.out.println("Unique characters are: " + s);
	}
}
