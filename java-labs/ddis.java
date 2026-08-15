import java.io.*;
import java.util.*;
class ddis
{
public static void main(String[ ] args)
{
int b,c,n,sum1=0,x,y;
double sum=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
x=n;
y=n;
do
{b=n%10;
sum1++;
n=n/10;
}while(n>0);
do
{c=x%10;
sum=Math.pow(c,sum1)+sum;
sum1--;
x=x/10;
}while(x>0);
if(y==sum)
{System.out.println("it is an disarium number");}
else
{System.out.println("it is not an disarium number");}
}}