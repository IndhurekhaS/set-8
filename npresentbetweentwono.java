import java.util.*;
public class nobw{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n>a && b>n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
