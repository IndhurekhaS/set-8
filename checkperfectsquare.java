import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=n*m;
        for(int i=1;i<=n;i++)
        {
            int q=i*i;
            if(s==q)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
