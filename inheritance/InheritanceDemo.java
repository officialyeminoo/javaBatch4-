class Aclass{
	// public String name = "John";
	// protected int age = 20;

	protected String name;
	protected int age;

	public Aclass(){
		System.out.println("parent constructor");
	};

	public Aclass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return "Name : " + this.name + " "+
				"Age : " + this.age;
	}
}

class Bclass extends Aclass
{	
	char gender;

	public Bclass(){
		super();
	}
	public Bclass(String name, int age, char gender)
	{
		super(name,age); // super() parent 
		this.gender = gender; // this is current class 
	}
}
public class InheritanceDemo
{
	public static void main(String[] args)
	{
			// Aclass obj = new Aclass();
			// System.out.println(obj.name);
			// System.out.println(obj.age);
			// Bclass obj1 = new Bclass();
			// System.out.println(obj1.name);

		// parent obj // default cont
		Aclass obj1 = new Aclass("John",40);
		System.out.println(obj1.toString());

		Bclass obj2 = new Bclass("Son John",20,'M');
		System.out.println(obj2.toString());


		System.out.println(" ======= Default parent constructor======");
		Bclass b = new Bclass();
		System.out.println(b);
	}
}

// inheritance 
// 3 
// single inheritance 
// multilevel inheritance 
// hybrid in 