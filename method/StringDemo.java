public class StringDemo
{
	public static void main(String[] args)
	{
		// character array = 

		String vowel = "aeiou";
		char[] vowels = {'a','e','i','u'};

		// length (attribute )
		int strLength = vowel.length();

		System.out.println("Length of vowel : " + strLength);

		// charAt()
		System.out.println("Char At " + vowel.charAt(4));

		// 

		String name = "John Doe";

		String greeting = "Hello ";

		System.out.println(greeting + name);

		// String Concatentation 
		System.out.println(greeting.concat(name));

		// uppercase
		String lowerString = "hello world";

		System.out.println("uppercase  " + lowerString.toUpperCase());

		// to lowercase()

		String upCase = "HELLO WORLD";

		System.out.println(upCase.toLowerCase());


		// trim 
		String trimString = "     Hello          World      ";

		System.out.println(trimString);
		System.out.println(trimString.trim());

		String mygeet = "Hello How are you";

		System.out.println(mygeet.repeat(5)+ " ,");

		System.out.println(mygeet.indexOf("are"));
	}
}