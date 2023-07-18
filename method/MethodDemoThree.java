public class MethodDemoThree
{
	public static void main(String[] args)
	{
		System.out.println(greeting(7));

		twoPower(2,3);
		twoPower(2,20);

		evenOdd(215285);
	}

	public static String greeting(int age)
	{
		// twoPower(2,3);
		System.out.println(age);
		return "String Return"; // String 

	}

	public static void twoPower(int base, int power)
	{
		int result = 1;
		for (int x =1; x<= power; x++)
		{
			result = result * base;
		}

		System.out.println(result);
	}

	public static void evenOdd(int num)
	{
		if(num%2 == 0)
			System.out.println(num + " is even Number");
		else 
			System.out.println(num + " is odd Number");
	}
}

// no parmeter no return
// with prameter no return

// with pareameter with return
// no pareameter with return
