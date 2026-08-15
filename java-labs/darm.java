import java.io.*;
import java.util.*;
class darm
{
public static void main(String[ ] args)
{
int b,n,sum=0,c,x;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
x=n;
do
{b=n%10;
c=b*b*b;
sum=sum+c;
n=n/10;
}while(n>0);
if(sum==x)
{System.out.println(x+" is an armstrong number");}
else
{System.out.println(x+" is not an armstrong number");}

}}