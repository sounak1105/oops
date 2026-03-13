import java.util.*;
public class nullpointexception
{
    public static void main(String args[])
    {
        Scanner sc;
        try{
            int a=sc.nextInt();
            System.out.println("a= "+a);
        }
        catch(NullPointerException e)
        {
            System.out.println("error: do again "+e.getMessage());
        }
    }
}