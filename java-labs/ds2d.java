import java.io.*;
import java.util.*;
class ds2d
{
public static void main(String[ ] args)
{
int b,n,sum=0,sum1=1,x,c=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
x=n;
do
{b=n%10;
sum=sum+b;
sum1=sum1*b;
n=n/10;
}while(n>0);
c=sum+sum1;
if(c==x)
{System.out.println("it is a special 2 digit number");}
else
{System.out.println("it is not a special 2 digit number");}
}}
