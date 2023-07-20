package Fibonacci;
import java.util.*;

public class Fibonacci {
	
	public static int fib(int number)
	{
		if(number == 0)
		{
			return 0;
		}
		if(number == 1)
		{
			return 1;
		}
		return fib(number-1) + fib(number -2);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(fib(number));
	}

}
