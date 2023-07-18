public class ThreeDimensionalArray 
{
    public static void main(String[] args) 
    {
        int test [][][] = {

            {
                {1,2,3},
                {11,12,13}
            },
            {
                {10,20,30},
                {111,222,333}
             }
            ,
            {
                {40,50,60}
            },
        };

        System.out.println(test[0][1][2]);
        System.out.println(test[1][0][0]);
        System.out.println(test[1][1][2]);

        System.out.println(test[2][0][2]);
       
    }
}
