public class ArrayMethodArgumentDemo
{
	public static void main(String[] args)
	{
		int numbers[] = {12,20,30,14,50};

		// call (invokeing)
		arrayToMethod(numbers);

	}
	
	public static void arrayToMethod(int[] number)
	{
		for(int x = 0; x<number.length; x++)
		{
			System.out.println(number[x]);
		}
	}

}