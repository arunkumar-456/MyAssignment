package week1.day2;

import java.util.Arrays;

public class secondlargestnumber {
	public static void main (String[] args)
	{
		int ark[] = { 22, 67, 98, 34, 1, 58, 99};
		Arrays.sort(ark);
		System.out.println("the secomd largest number in array is:" +ark[ark.length -2]);
		
	}

}
