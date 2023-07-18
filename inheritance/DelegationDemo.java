class Animal 
{
	// static variable or non static variable  (class level) 
	public void eating()
	{
		System.out.println("Animal Eating");
	}
}

class Pig
{
	Animal obj = new Animal(); // class level 

	public void eating()
	{
		obj.eating();

		System.out.println("pig Eating");
	}
}

public class DelegationDemo
{
	public static void main(String[] args)
	{
		// pig obj

		Pig pObj = new Pig();
		pObj.eating();
	}
}