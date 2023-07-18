
public class MethodOverloadingDemo
{
	public static void main(String[] args)
	{
		addNum(25,369);
		addNum();
		addNum(10.36d ,25.36d);
	}
	public static void addNum(){
		System.out.println("addNum");
	}
	public static void addNum(int x, int y)
	{
		System.out.println(x+y);
	}

	public static void addNum(double p, double c)
	{
		System.out.println(p+c);
	}
}

// public access modifier  
// class peroson  default 


// public 
// protected 
// private
// default 