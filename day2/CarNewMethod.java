package week1.day2;

public class CarNewMethod {
	
	public int SubTwonumbers(int a, int b)
	{int c= a-b;
	return c;
	}
	public int mulTwonumbers(int d, int e)
	{int f= d*e;
	return f;
	}
	public int divTwonumbers(int g, int h)
	{int i= g/h;
	return i;
	}
	
	public void printCarBrand()
	{ System.out.println("Hyundai");}
	
	public String getCarColor()
	{return "red";}
	
	public static void main(String[] args)
	{
		 CarNewMethod ask = new CarNewMethod();
		 ask.printCarBrand();
		 String carColor = ask.getCarColor();
		 System.out.println(carColor);
		 ask.SubTwonumbers(20, 10);
		 int Sub = ask.SubTwonumbers(20, 10);
		 System.out.println(Sub);
		 ask.mulTwonumbers(20, 10);
		 int mul = ask.mulTwonumbers(20, 10);
		 System.out.println(mul);
		 ask.divTwonumbers(20, 10);
		 int div = ask.divTwonumbers(20, 10);
		 System.out.println(div);
		 
		 
		 }
}
