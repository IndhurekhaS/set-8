import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int a=s.length();
      int b=a/2;
      if(a%2==0){
      for(int i=0;i<1;i++)
      {
           String s7=s.substring(i,b-1);
           System.out.print(s7);
      }
      }
      else
      {
          for(int i=0;i<1;i++)
          {
              String s11=s.substring(i,b);
              System.out.print(s11);
          }
      }
     
          if(a%2==0)
          {
              char[] ch=s.toCharArray();
              char ch1=ch[b-1];
              char ch2=ch[b];
              String s1= String.valueOf(ch1);
              String s2=String.valueOf(ch2);
              String s4=s1.replace(s1,"*");
              String s5=s2.replace(s2,"*");
              String s6=s4.concat(s5);
              System.out.print(s6);
          }
          else
          {
              char[] ch4=s.toCharArray();
              char ch5=ch4[b];
              String s9=String.valueOf(ch5);
              String s10=s9.replace(s9,"*");
              System.out.print(s10);
          }
      for(int i=0;i<1;i++)
      {
          String s8=s.substring(b+1);
           System.out.print(s8);
      }
      
    }
}
