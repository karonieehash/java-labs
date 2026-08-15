import java.io.*;
import java.util.*;
class big24
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

 if (a>b&&a>c&&a>d)
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


else if(a==b)
{
if(b>c&&b>d)
{
System.out.println("the biggest number is "+ "a " + "and b");}
else if(c>a&&d==c)
{
System.out.println("the biggest number is "+ "d " + "and c");}
else if(b>c&&b<d)
{
System.out.println("the biggest number is "+ "d");}
else if(b<c&&d<c)
{System.out.println("the biggest number is "+ "c");}
else if(b==c&&c==d)
{System.out.println("all four numbers are equal");}
else if(b==c&&c<d)
{System.out.println("the biggest number is "+ "d");}
else if(b==d&&d<c)
{System.out.println("the biggest number is "+ "c");}

else if(b==c&&c>d)
{System.out.println("the biggest number is "+ "a  b and c");}
else if(b==d&&d>c)
{System.out.println("the biggest number is "+ "a  b and d");}


}

else if(a==c)
{
if(c>b&&c>d)
{
System.out.println("the biggest number is "+ "a " + "and c");}
if(b>a&&b==d)
{
System.out.println("the biggest number is "+ "b " + "and d");}

else if(c>b&&c<d)
{
System.out.println("the biggest number is "+ "d");}
else if(c<b&&d<b)
{System.out.println("the biggest number is "+ "b");}
else if(b==c&&c==d)
{System.out.println("all four numbers are equal");}
else if(b==c&&b<d)
{System.out.println("the biggest number is "+ "d");}
else if(d==c&&d<b)
{System.out.println("the biggest number is "+ "b");}
else if(b==c&&b>d)
{System.out.println("the biggest number is "+ "a  b and c");}
else if(c==d&&d>b)
{System.out.println("the biggest number is "+ "a  c and d");}



}
else if(c==b)
{
if(c>a&&c>d)
{
System.out.println("the biggest number is "+ "b " + "and c");}
else if(d>c&&a==d)
{
System.out.println("the biggest number is "+ "a " + "and d");}

else if(c>b&&a<d)
{
System.out.println("the biggest number is "+ "d");}
else if(c<a&&d<a)
{System.out.println("the biggest number is "+ "a");}
else if(a==c&&c==d)
{System.out.println("all four numbers are equal");}
else if(b==a&&b<d)
{System.out.println("the biggest number is "+ "d");}
else if(b==d&&d<a)
{System.out.println("the biggest number is "+ "a");}

else if(b==a&&b>d)
{System.out.println("the biggest number is "+ "a  b and c");}
else if(c==d&&d>a)
{System.out.println("the biggest number is "+ "b  c and d");}



}
else if(a==d)
{
if(d>c&&b<d)
{
System.out.println("the biggest number is "+ "a " + "and d");}
else if(d>c&&b>d)
{
System.out.println("the biggest number is "+ "b");}
else if(d<c&&b<c)
{System.out.println("the biggest number is "+ "c");}
else if(b==c&&a==c)
{System.out.println("all four numbers are equal");}
else if(d==c&&c<b)
{System.out.println("the biggest number is "+ "b");}
else if(d==b&&b<c)
{System.out.println("the biggest number is "+ "c");}

else if(d==c&&c>b)
{System.out.println("the biggest number is "+ "a  c and d");}
else if(b==d&&b>c)
{System.out.println("the biggest number is "+ "a  b and d");}


}

else if(c==d)
{
if(c>a&&c>b)
{
System.out.println("the biggest number is "+ "d " + "and c");}
else if(c>b&&a<b)
{
System.out.println("the biggest number is "+ "b");}
else if(c<a&&b<a)
{System.out.println("the biggest number is "+ "a");}
else if(b==c&&a==d)
{System.out.println("all four numbers are equal");}
else if(d==a&&d<b)
{System.out.println("the biggest number is "+ "b");}
else if(d==b&&b<a)
{System.out.println("the biggest number is "+ "a");}
else if(d==a&&d>b)
{System.out.println("the biggest number is "+ "a  d and c");}
else if(c==b&&b>d)
{System.out.println("the biggest number is "+ "b  c and a");}
else if(c==d&&d>a)
{System.out.println("the biggest number is "+ "b  c and d");}



}
else if(b==d)
{
if(b>a&&b>c)
{
System.out.println("the biggest number is "+ "b " + "and d");}
else if(c>b&&a<c)
{
System.out.println("the biggest number is "+ "c");}
else if(c<a&&d<a)
{System.out.println("the biggest number is "+ "a");}
else if(b==c&&c==d)
{System.out.println("all four numbers are equal");}
else if(b==a&&a<c)
{System.out.println("the biggest number is "+ "c");}
else if(b==c&&c<a)
{System.out.println("the biggest number is "+ "a");}
else if(b==a&&b>c)
{System.out.println("the biggest number is "+ "a  b and d");}
else if(c==d&&d>a)
{System.out.println("the biggest number is "+ "b  c and d");}



}






}}