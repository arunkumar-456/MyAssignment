package week1.day2;

public class calculator {

	public int add(int a, int b,int c)
	{
	int d = a+b+c;
	return d;
	}
	public int sub(int e, int f)
	{
		int g = e-f;
		return g;
	}
	public double mul(double h, double i)
	{
		double j= h* i;
		return j;
	}
	public float div(float k, float l)
	{
		float m= k/l;
		return m;
	}
	
	public static void main(String args[]) 
	{
		calculator bas = new calculator();
		System.out.println("additio of 3 number"+ bas.add(10, 20,30));
		System.out.println("sub of 2 number"+ bas.sub(10, 20));
		System.out.println("mul of 2 number"+ bas.mul(20,30));
		System.out.println("div of 2 number"+ bas.div(10,30));
		
		
		
	
	}
	
		
	
}

