class Animal 
{
	// attriubute
	// behaviour 
	// constructor
	// getter and setter toString 

	String name;
	int age;

	public Animal(){}
	.
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}

	// getter of name 
	public String getName()
	{
		return this.name;
	}

	// setter of name
	public void	setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return "Name : " + this.name + " " +
				"Age : " + this.age;
	}
}

public class GetterSetterDemoOne
{
	public static void main(String[] args)
	{
		// obj 
		Animal obj1 = new Animal(); // default constructor 
		
		obj1.setName("Cat"); // set 

		System.out.println(obj1.getName()); // get 


		// obj
		Animal obj2 = new Animal("Dog", 3);

		System.out.println(obj2.toString());
	}
}