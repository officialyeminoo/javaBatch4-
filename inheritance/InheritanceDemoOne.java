class Parent 
{
	int money = 10000000;
	String name;
	int age;

	public Parent(){}; // default 
	public Parent(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Name : " + this.name + "\n" +
				"Age : " + this.age;
	}
}

class Child extends Parent
{
	String ride = "Cars";
	char gender;

	public Child(){}
	public Child(String name, int age, char gender)
	{
		super(name, age);
		this.gender = gender;
	}

	public String toString()
	{
		return "Name : " + this.name + "\n" +
				"Age : " + this.age + "\n" +
				"Gender : " + this.gender;
	}
}
public class InheritanceDemoOne
{
	public static void main(String[] args)
	{
		// Parent obj
		Parent pObj = new Parent("U Hla",55);
		System.out.println(pObj.toString());

		// child Obj
		Child obj  = new Child();

		System.out.println(obj.money);
		System.out.println(obj.ride);

		Child cObj = new Child("Mg Mg", 12,'M');

		System.out.println(cObj.toString());
	}
}


// class A
// class B extends A 
// class C extends B
// class E extends C 

// class D extends A,B,
// implements A,B,C


