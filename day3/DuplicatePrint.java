package week3.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatePrint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String upi="Digital India";
		char[] ak=upi.toCharArray();
		String s=Arrays.toString(ak);
		Set<Character>charSet=new HashSet<Character>();
		Set<Character>dupCharSet=new HashSet<Character>();
		for (char c : ak) {
			if (!charSet.add(c)) {
				dupCharSet.add(c);
			}
		}
		System.out.println("Elements in array: " + s);
		System.out.println("Duplicte elements are: " + dupCharSet);

	}

}
