import java.io.*;
import java.util.*;
class big25
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
System.out.println("enter the number for d");
int d=tv.nextInt();
if(a==b&&b==c&&c==d)
{
System.out.println("all 4 numbers are equal ");}
else if(a==b&&b==c&&c>d)
{
System.out.println("the biggest number is "+"a b and c");}
else if(a==b&&b==d&&d>c)
{
System.out.println("the biggest number is "+"a b and d");}
else if(d==b&&b==c&&c>a)
{
System.out.println("the biggest number is "+"b c and d");}
else if(a==c&&d==c&&d>b)
{
System.out.println("the biggest number is "+"a c and d");}
else if(a==b&&a>c&&b>d)
{
System.out.println("the biggest number is "+"a b");}

else if(a==c&&a>b&&c>d)
{
System.out.println("the biggest number is "+"a c");}
else if(a==d&&a>c&&d>b)
{
System.out.println("the biggest number is "+"a d");}
else if(c==b&&b>a&&c>d)
{
System.out.println("the biggest number is "+"b c");}

else if(d==b&&d>c&&b>a)
{
System.out.println("the biggest number is "+"b d");}
else if(c==d&&c>a&&d>a)
{
System.out.println("the biggest number is "+"c d");}
else if (a>b&&a>c&&a>d)
{
System.out.println("the biggest number is  "+"a");
}
else if(b>a&&b>c&&b>d)
{
System.out.println("the biggest number is "+"b");
}
else if(c>a&&c>b&&c>d) 
{
System.out.println("the biggest number is "+"c");
}
else if(d>a&&d>b&&d>c) 
{
System.out.println("the biggest number is "+"d");
}

}}





