import student.StudentInfo;
import teacher.TeacherInfo;

public class RunApp
{
	public static void main(String[] args)
	{
		// creating obj 
		StudentInfo obj1 = new StudentInfo();
		System.out.println(obj1.name);
		System.out.println(obj1.stdInfo());
		obj1.age = 20;

		System.out.println(obj1.age);

		// creating obj2 
		StudentInfo obj2 = new StudentInfo();
		obj2.name = "Su Su";
		obj2.age = 24;

		System.out.println("====obj2======");
		System.out.println(obj2.name);
		System.out.println(obj2.age);

		TeacherInfo trObj = new TeacherInfo();
		trObj.trName = "Hla Hla";
		System.out.println(trObj.trName);

		trObj.teachingSubject("English"); // argument 

		DefaultDemo dObj = new DefaultDemo();
		System.out.println(dObj.test);
	}
}

// method - build in / user define method 
//  package - build in (Standard librarry package )/ urs define 

// java - Se () core java (swing/ java Fx - desktop app)
// java - Me => Mobile app
// java - EE => website (java se + framwork)


// folder => snake 
// packege

// public -> can accept anywhere 
// default -> the same packege 