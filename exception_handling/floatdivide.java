import java.util.*;
public class floatdivide
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers you want to divide");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        try
        {
            float d=a/b;
            System.out.println("answer after division: "+d);
        }
        catch(ArithmeticException e)
        {
            System.out.println("there was a error : "+e.getMessage());
        }
    }
}