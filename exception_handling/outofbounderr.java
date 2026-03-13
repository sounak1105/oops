import java.util.*;
public class outofbounderr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers in array");
        int[] a=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        try
        {
            
            System.out.println("the 5th element in array is: "+a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("there was a error : "+e.getMessage());
        }
    }
}