class Person
{
	String name;
	int age;
	char gender;

	// Constructor
	public Person() // no parameter 
	{
		System.out.println("Default Constructor");
	}
	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;

	}
	// getter of name
	public String getName()
	{
		return this.name;
	}

	// setter of name
	public void setName(String name)
	{
		this.name = name;
	}

	// getter of age()
	public int getAge()
	{
		return this.age;
	}

	// setter of age

	public void setAge(int age)
	{
		this.age = age;
	}

	// getter of gender
	public char getGender()
	{
		return this.gender;
	}

	// setter of gender
	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public void personInfo()
	{
		System.out.println("Person Name : " + this.name);
		System.out.println("Person age : " + this.age);
		System.out.println("Person Gender : " + this.gender);
	}

	// override ()
	public String toString()
	{
		return  "Name : " + this.name +
				" Age : " + this.age +
				" Gender : " + this.gender;
	}
}

public class ConstructorDemo
{
	public static void main(String[] args)
	{
		Person obj = new Person();// output(default constructor)

		obj.setName("ko ko");
		obj.setAge(20);
		obj.setGender('M');

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getGender());

		obj.personInfo();

		// obj

		Person obj1 = new Person("Ko Ko", 23, 'M');
		System.out.println("=========Constructor =======");
		obj1.personInfo();

		System.out.println("=== toString ===");
		System.out.println(obj1.toString());


	}
}


/*

setter();
getter();

method()

void no return
class name()//
*/

// method => ge = c