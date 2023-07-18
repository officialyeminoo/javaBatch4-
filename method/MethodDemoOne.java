public class MethodDemoOne 
{
   public static void greeting(String message) // no retrun with parameter
   {
      System.out.println(message);
   }
   public static void main(String[] args)  // main 
   {
      // call method 

      addNum(25,30);// arguments 
      addNum(5000, 265888);

       userInfo();

       greeting("Mingalarpar"); // arguments 
       greeting("How are you"); // arguments 
       greeting("250"); // arguments 

   } 

//    no return no parameter 
   public static void userInfo()
   {
        System.out.println("i am a method");
   }

   // no return wiht parameter  
   public static void addNum(int num1, int num2) // parameter
   {
      // int sumResult = num1 + num2;
      // System.out.println(sumResult); 

      System.out.println( "Sum Num " + (num1+num2));
   } 

}


// method or function  (1) build-in method (2) user-defined method 
// user();

// public  is Access Modifier 
// static = member 
// void => no need to return 
// 
