import.java.io.*;
import java.util.*;
class equal
{
public static void main(Sting[]args)
{
int a,b,c;
Scanner in= new Scanner(System.in);
System.out.println("enter A number:");
a=in.nextInt();
System.out.println("enter B number:");
b=in.nextInt();
System.out.println("enter C number:");
c=in.nextInt();
if(a==b&&b==c)
{System.out.println("all are equal");}
else if(a==b&&a>c)
{System.out.println("A&B are greater than C");}
else if(a==c&&a>b)
{System.out.println("A&C are greater than B");}
else if(b==c&&b>a)
{System.out.println("B&C are greater than A");}
else if(a>b&&a>c)
{System.out.println("A is greater");}
else if(b>a&&b>c)
{System.out.println("B is greater");}
else 
{System.out.println("C is greater");}
}
}









