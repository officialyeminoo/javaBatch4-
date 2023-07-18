
public class ExampleTwo
{
	public static void main(String[] args)
	{
		System.out.println(caculateNumber(25,365,'+'));
		System.out.println(caculateNumber(25,365,'-'));
		System.out.println(caculateNumber(25,365,'8'));
	}

	public static int caculateNumber(int num1, int num2, char operator)
	{
		int result = 0;

		if(operator == '+' )
		{
			result = num1 + num2;
		}
		else if(operator == '-')
		{
			result = num1 - num2;
		}
		else if(operator == '*')
		{
			result = num1 * num2;
		}
		else if(operator == '/')
		{
			result = num1 / num2;
		}
		else if(operator == '%')
		{
			result = num1 % num2;
		}
		else
		{
			result = 0;
		}
		
		// return value 
		return result;
	}
}