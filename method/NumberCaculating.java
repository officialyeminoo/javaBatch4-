public class NumberCaculating 
{
    public static void main(String[] args)
    {
        // call mehtod 
        caculateNum(2562, 58452, '+');
        caculateNum(525851, 2588, '-');
        caculateNum(525851, 2588, '1');
    }

    public static void caculateNum(int num1, int num2, char operator)
    {
        switch(operator)
        {
            case '+' : System.out.println("Sum Number " +(num1+num2));break;
            case '-' : System.out.println("Subtraction Number " +(num1-num2));break;
            case '*' : System.out.println("Multi Number " +(num1*num2));break;
            case '/' : System.out.println("div Number " +(num1/num2));break;
            case '%' : System.out.println("Modu Number " +(num1%num2));break;
            default : System.out.println("Wrong operator");
        }
    }
}


/*
 * num1
 * num2 
 * operator 
 * '+' => num1 + num2
 * '-' => num1 - num 2 
 * ''*' => num1 * num 2
 * 
 */