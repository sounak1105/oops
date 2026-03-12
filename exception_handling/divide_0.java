import java.util.*;
public class divide_0
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers you want to divide");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
            int d=a/b;
            System.out.println("answer after division: "+d);
        }
        catch(ArithmeticException e)
        {
            System.out.println("there was a error : "+e.getMessage());
        }
    }
}