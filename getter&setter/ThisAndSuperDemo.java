class Parent
{
	String name;
	int age;
	int money = 500000;

	public Parent()
	{
		System.out.println("Parent constructor");
	}

	public void parentOcc()
	{
		System.out.println("Parent is doctor ");
	}
}
class Child extends Parent
{
	int money = 600; 
	String name = "Mg Mg";

	public Child()	
	{
		super(); // calling parent constuctor
		System.out.println("child constructor");
	}

	public void childInfo()
	{
		parentOcc(); // method 
		System.out.println(this.name);
		System.out.println(super.money); // attribute 
		System.out.println(this.money); // attribute 
	}
}
public class ThisAndSuperDemo
{
	public static void main(String[] args)
	{
		// Parent obj 
		Parent p = new Parent();

		Child c = new Child();
		c.childInfo();

	}
}