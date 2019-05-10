import java.util.*;
public class MyClass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        char[] ch=String.valueOf(n).toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char c=ch[i];
            if(c%2!=0)
            {
                System.out.print(c+" ");
            }
        }
    }
}
