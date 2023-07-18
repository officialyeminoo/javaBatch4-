class Person 
{
	String name; // 3 => "ko ko" 
	int age;

	// getter of name(this) // current class 
	public String getName()
	{
		return this.name; //ojb1.getname()
	}

	// set name ("ko ko ") => 3 ojb1.set("koko")
	public void	setName(String name) // this current class super();
	{
		this.name = name;
	}

}
public class GetterSetterDemo
{
	public static void main(String[] args)
	{
		//Object creating
		Person obj1 = new Person();

		obj1.name = "John Doe";
		// System.out.println(obj1.name);

		System.out.println(obj1.name);

		obj1.age = 20; // set age 
		System.out.println(obj1.age);

		obj1.setName(" Hla Hla");

		System.out.println(obj1.getName());


		// new obj
		Person obj2 = new Person();
		
		obj2.setName("Ko Ko"); 
		System.out.println(obj2.getName()); // ko ko

		obj2.name = "soe soe";
		System.out.println(obj2.getName());
	}
}