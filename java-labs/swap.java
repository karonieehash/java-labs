import java.io.*;
import java.util.*;
class swap
{
 public static void main(String[ ] args)
{
 int a,b,c;
 Scanner ave=new Scanner(System.in);
 System.out.println("enter a number");
 a=ave.nextInt();
 System.out.println("enter a number");
 b=ave.nextInt();
c=0;
c=a+b;
a=c-a;
System.out.println("sucessfully swapped from b to a  "+a);
b=c-b;
System.out.println("sucessfully swapped from a to b  "+b);
}
}