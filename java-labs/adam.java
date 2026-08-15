import java.io.*;
import java.util.*;
class adam
{
public static void main(String[ ] args)
{
int n,b,c,x,sum=0,sum1=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
x=n;
n=n*n;
while(n>0)
{
b=n%10;
sum=sum*10+b;
n=n/10;
}
while(x>0)
{
c=x%10;
sum1=sum1*10+c;
x=x/10;
}
sum1=sum1*sum1;
if(sum==sum1)
{ System.out.println("it is a adam number");}
else
{
System.out.println("it is not an adam number");}

}}
