interface Greeting
{
	public void humanGreeting(); // no body 
}
interface NationalFood
{
	public void food();
}

class Myanmar implements Greeting, NationalFood
{
	public void humanGreeting()
	{
		System.out.println("We, Myanmar say : Mingalarpar");
	}

	public void food()
	{
		System.out.println("We, Myanmar like : Monkhinkha");
	}
} 

class England implements Greeting{
	public void humanGreeting()
	{
		System.out.println("England are saying : How are you?");
	}
}
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		// Myanmar Obj
		Myanmar m = new Myanmar();
		m.humanGreeting();
		m.food();

		England e = new England();
		e.humanGreeting();
	}
}