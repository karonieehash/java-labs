import java.io.*;
import java.util.*;
class big23
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number for a");
int a=tv.nextInt();
System.out.println("enter the number for b");
int b=tv.nextInt();
System.out.println("enter the number for c");
int c=tv.nextInt();
if(a==b)
{
if(b>c)
{
System.out.println("the biggest number is "+ "a " + "and b");}
else if(b<c)
{System.out.println("the biggest number is "+ "c");}
else if(b==c)
{System.out.println("all three numbers are equal");}
}

else if(a==c)
{
if(a>b)
{
System.out.println("the biggest number is "+ "a and " + "c");}
else if(a<b)
{System.out.println("the biggest number is "+ "b");}
else if(b==c)
{System.out.println("all three numbers are equal");}

}
else if(c==b)
{
if(c>a)
{
System.out.println("the biggest number is "+ "c and" + "b");}
else if(c<a)
{
System.out.println("the biggest number is "+ "a");}
else if(a==c)
{System.out.println("all three numbers are equal");}

}
else if (a>b&&a>c)
{
System.out.println("the biggest number is  "+"a");
}
else if(b>a&&b>c)
{
System.out.println("the biggest number is "+"b");
}
else if(c>a&&c>b) 
{
System.out.println("the biggest number is "+"c");
}
}}