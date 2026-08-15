import java.io.*;
import java.util.*;
class floop2
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter which factorial to be printed");
int a=tv.nextInt();
int b=1;
for(int i=1;i<=a;i++)
{
 b=b*i;
}
System.out.println("the factorial of "+a +" is "+ b);
}}
