import java.io.*;
import java.util.*;
class swap3
{
 public static void main(String[ ] args)
{
 Scanner tvk=new Scanner(System.in);
 int a,b;
 System.out.println("enter the value of a");
 a=tvk.nextInt();
System.out.println("enter the value of b");
 b=tvk.nextInt();
 a=a+b;
b=a-b;
a=a-b;
System.out.println("sucessfully swapped from b to a "+ a);
System.out.println("sucessfully swapped from a to b "+ b);
}
}