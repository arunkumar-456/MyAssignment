package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;

		for (int j = 2; j <= n-1;) {
			if (n % j == 0) {
				System.out.println(n + "is not a prime number");
			} else {
				System.out.println(n + "is a prime number");
			}
			break;
		}}}
