import java.io.*;
import java.util.*;
class indirect
{
 public static void main(String[ ] args)
{
 int a,b,c;
 Scanner cal=new Scanner(System.in);
 System.out.println("enter a number");
 a=cal.nextInt();
 System.out.println("enter a number");
 b=cal.nextInt();
 c=a+b;
 System.out.println("added value "+c);
  System.out.println("enter a number");
  a=cal.nextInt();
   System.out.println("enter a number");
 b=cal.nextInt();
  c=b-a;
System.out.println("subracted value "+c);
 System.out.println("enter a number");
 a=cal.nextInt();
 System.out.println("enter a number");
 b=cal.nextInt();
c=a*b;
System.out.println("multiplied value "+c);
System.out.println("enter a number");
 a=cal.nextInt();
 System.out.println("enter a number");
 b=cal.nextInt();
c=a*b;
System.out.println("divided value "+c);
}
}
