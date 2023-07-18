public class MethodDemoTwo
{
	// with parameter  with return 
	public static int getAge(int age)
	{
		System.out.println("with parameter  with return");
		return age;
		// System.out.println("with parameter  with return");
	}

	public static void main(String[] args)
	{
		// variable name = identifier 
		String greeting = greetingMessage();
		System.out.println(greeting);

		System.out.println(greetingMessage());

		// call getAge
		System.out.println(getAge(27));
	}

	// datatype 
	// no parameter with return 
	public static String greetingMessage()
	{
		return "Hello Mingalarpar";
		// return 4;
	}
}