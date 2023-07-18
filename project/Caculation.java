import java.util.Scanner;

public class Caculation
{
	public static void main(String[] args)
	{
		// scanner Obj
		Scanner userInput = new Scanner(System.in);
		int choice; // not 

		do{
			System.out.println("1.To Caculate even");
			System.out.println("2.To Caculate Circle Area");
			System.out.println("3.To Caculate C to F");
			System.out.println("4.To Caculate F to C");
			choice = userInput.nextInt();

			switch(choice)
			{
			case 1 :
				evenOdd();
				break;
			case 2 : 
				System.out.println("Type radius");
				double radius = userInput.nextDouble();
				circleArea(radius);
				break;
			case 3 :
				System.out.println("Type c Temperature");
				double ce = userInput.nextDouble();
				cToF(ce);
				break;
			case 4 :
				System.out.println("Type F Temperature");
				double f = userInput.nextDouble();
				fToC(f);
				break;
			default : System.out.println("Invalid choice , Choice again");
			}

		}while(choice!=5);

	}

	public static void evenOdd()
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose your number");

		int num = userInput.nextInt();
		
		if (num %2 == 0)
		{
			System.out.println(num + " is even");
		}
		else
		{
			System.out.println(num + "is odd");
		}
	}

	public static void circleArea( double radius)
	{
		System.out.println("Circle Area is + " + (Math.PI * radius * radius));
	}

	public static void cToF(double ce)
	{
		double f = (ce *1.8) +32;
		System.out.println("Temperature is : " + f + "F");
	}

	public static void fToC(double f)
	{
		double ce = (f-32)/ 1.8;
		System.out.println("Temperature is : " + ce + "c");
	}
}