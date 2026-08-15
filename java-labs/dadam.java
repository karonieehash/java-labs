import java.io.*;
import java.util.*;
class dadam
{
public static void main(String[ ] args)
{
int b,c,n,sum=0,sum1=0,x;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
x=n;
n=n*n;
do
{b=n%10;
sum=sum*10+b;
n=n/10;
}while(n>0);
do
{c=x%10;
sum1=sum1*10+c;
x=x/10;
}while(x>0);
sum1=sum1*sum1;
if(sum1==sum)
{System.out.println("it is an adam number");}
else
{System.out.println("it is not an adam number");}
}}


