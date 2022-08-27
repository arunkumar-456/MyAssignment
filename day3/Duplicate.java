package week3.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };
		String n1 = Arrays.toString(data);
		Set<Integer> n = new HashSet<Integer>();
		Set<Integer> n2 = new HashSet<Integer>();

		for (int in : data) {
			if (!n.add(in)) {
				n2.add(in);
			}
		}
		System.out.println("Elements in array: " + n1);
		System.out.println("The Duplicate numbers are: " + n2);

	}
}
