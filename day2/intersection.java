package week1.day2;

public class intersection {
	public static void main(String[] args)
	{
		int arr1[]= {3,2,11,4,6,7};
		int arr2[]= {1,2,8,4,9,7};
		for (int m=0; m<arr1.length; m++)
		{
		for (int n=0; n<arr2.length; n++)
			{
			if(arr1[m]==arr2[n])
			{
				System.out.println(arr2[n]);
			}
			}
	}

}}
