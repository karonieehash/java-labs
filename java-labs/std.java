import java.io.*;
import java.util.*;
class std
{
public static void main(String[ ] args)
{
int n,b,c,d,sum=0,sum1=1;
Scanner tv=new Scanner(System.in);
System.out.println("enter an number");
n=tv.nextInt();
d=n;
while(n>0)
{
b=n%10;
sum=sum+b;
sum1=sum1*b;
n=n/10;
}
c=sum1+sum;
if(c==d)
{System.out.println("it is a special two digit number");}
else
{System.out.println("it is not a special two digit number");}

}}
