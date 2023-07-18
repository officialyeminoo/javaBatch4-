class Aclass // default class 
{
	String name = "John Doe"; // non-static variable 
	int age; 

	static char gender = 'M'; // static variable

	public static void info() // static method 
	{
		Aclass obj2 = new Aclass();
		System.out.println("=======Method Info==========");
		System.out.println(obj2.name);
		System.out.println(gender);
	}

	public String usrName() // non-static mehtod
	{
		return name; 
	}
}

public class ClassDemo // public class 
{
	String name = "Akries"; // non-static variable 

	public static void main(String[] args)
	{
		ClassDemo cObj1 = new ClassDemo();
		System.out.println(cObj1.name); // Akries

		// Object create
		// classNameda name(identifier) = new className()
		Aclass obj1 = new Aclass();
		System.out.println(obj1.name); // John Doe
		System.out.println(obj1.age); // 0

		System.out.println(obj1.gender);
		
		// System.out.println(obj1.info());
		obj1.info();

		System.out.println("===============");
		System.out.println(obj1.usrName());
		

	}
}

// clssa =  the blueprint of obj
// template of object 
// attrubute & behviour 

// local variable => inside block scope or method 
// static variable
// non-static variable


// static member or class => obj


// method

// static method  and non static method 
// 4 


// 1=>2 =>3 
// byte =