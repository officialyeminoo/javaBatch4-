class Animal
{
	public void voice()
	{
		System.out.println("Animal voice");
	}
}

class Pig extends Animal
{
	public void voice()
	{
		System.out.println("Pig voice : kwe kwe kwe");
	}
}

class Cat extends Animal
{
	public void voice()
	{
		System.out.println("Meow Meow");
	}
}
public class MethodOverriddingDemo
{
	public static void main(String[] args)
	{
		Pig babyPig = new Pig();
		babyPig.voice();

		Cat c = new Cat();
		c.voice();
	}
}