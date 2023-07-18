public class MultiDjimnsionalArrayOne 
{
    public static void main(String[] args)
    {
        int nums[][] = {{12,20,30},{21,25,27}};

        for(int n[] : nums)
        {
            for(int newNum : n)
            {
                System.out.print(newNum + ",");
            }

            System.out.println();
        }
    }
}
