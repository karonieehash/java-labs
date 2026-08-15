import java.io.*;
import java.util.*;
class swap4
{
 public static void main(String[ ] args)
{
 Scanner tvk=new Scanner(System.in);
 int a,b,c;
 System.out.println("enter the value of a");
 a=tvk.nextInt();
System.out.println("enter the value of b");
 b=tvk.nextInt();
System.out.println("enter the value of c");
 c=tvk.nextInt();
 a=a+b+c;
b=a-b-c;
c=a-b-c;
a=a-b-c;
System.out.println("sucessfully swapped from c to a "+ a);
System.out.println("sucessfully swapped from a to b "+ b);
System.out.println("sucessfully swapped from b to c "+ c);
}
}