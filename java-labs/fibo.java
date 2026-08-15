import java.io.*;
import java.util.*;
class fibo
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number of series u want to print");
int a=tv.nextInt();
System.out.println("the fibonacci series of "+a+" is");
int b=0;
int c=1;
System.out.println(b);
System.out.println(c);
for(int i=3;i<=a;i++)
{
int d=b+c;
b=c;
c=d;
System.out.print(d);




System.out.println();
}
}}
