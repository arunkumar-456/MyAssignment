package week1.day2;

public class Fibonacci {
	
	public static void main(String[] args)
	{
		int numOne = 0;
		int numTwo = 1;
		int add = 0;
		
		for  (int j=1; j <= 11;  j++)
		{
			System.out.println(numOne);
			add = numOne+numTwo;
			numOne=numTwo;
			numTwo=add;
			
		}
		
	}

}
