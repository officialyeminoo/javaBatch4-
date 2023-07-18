public class MultiDimensionalArray
{
    public static void main(String[]args)
    {
        // firstOne
        // int number [] = new int[5]; 


        int [] numbers = {10,20, 30,40,50,60};

        // simple for loop 
        for(int x = 0; x< numbers.length ; x++)
        {
            System.out.println(numbers[x]);
        }

        // for each loop 

        System.out.println("=====================");
        for(int n : numbers)
        {
            System.out.println(n);
        }
    }
}

