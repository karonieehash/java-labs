import java.io.*;
import java.util.*;
class big1
{
public static void main (String[] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number  ");
int a=tv.nextInt();
System.out.println("enter the number  ");
int b=tv.nextInt();
System.out.println("enter the number  ");
int c=tv.nextInt();

if (a>b&&a>c)
{
System.out.println("the greatest number between a b c is "+a);
}
else if(b>a&&b>c)
{
System.out.println("the greatest number between a b c is "+b);
}
else 
{
System.out.println("the greatest number between a b c is "+c);
}
}}