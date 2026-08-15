import java.io.*;
import java.util.*;
class adam2
{
public static void main(String[ ] args)
{
int b,c,x,n;
for(int i=1;i<=100;i++)
{int sum=0,sum1=0;
n=i;
x=i;
n=n*n;
while(n>0)
{
b=n%10;
sum=sum*10+b;
n=n/10;}
while(x>0)
{
c=x%10;
sum1=sum1*10+c;
x=x/10;
}
sum1=sum1*sum1;
if(sum==sum1)
{
System.out.println(i);}
}
}}

