public class StaticVariableDemo
{
	static int num;
	static String username;
	static float price;
	static  char gender;

	public static void main(String[] args)
	{
		System.out.println(num);
		System.out.println(username);
		System.out.println(price);

		System.out.println(gender);

		demo();
	}
	public static void demo()
	{
		System.out.println("static variable : " + username);
	}
}

// class level 