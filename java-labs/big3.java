import java.io.*;
import java.util.*;
class big3
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter a number ");
int a=tv.nextInt();
System.out.println("enter a number ");
int b=tv.nextInt();
System.out.println("enter a number ");
int c=tv.nextInt();
System.out.println("enter a number ");
int d=tv.nextInt();
if(a>b&&a>c&&a>d)
{ 
System.out.println("the greatest number is  "+a);
}
else if(b>a&&b>c&&b>d)
{ 
System.out.println("the greatest number is  "+b);
}
else if(c>b&&c>a&&c>d)
{ 
System.out.println("the greatest number is  "+c);
}
else
{ 
System.out.println("the greatest number is  "+d);
}
}}