import java.util.Scanner;

public class ScannerClassDemo
{
	public static void main(String[] args)
	{
		// int num = 20;
		Scanner userInput = new Scanner(System.in);

		// System.out.println("Enter Your Name");
		// String userName = userInput.nextLine();
		// System.out.println(userName);


		// System.out.println("Enter Number");
		// int number = userInput.nextInt();

		// if (number %2 == 1)
		// {
		// 	System.out.println("Odd");
		// }
		// else{
		// 	System.out.println("even");
		// }


		// char charAt();
		String testString = "Hello World";
		System.out.println(testString.charAt(0));

		System.out.println("gender");

		char gender = userInput.nextLine().charAt(0);

		System.out.println("Gender : " + gender);

		// next()
	}

}
