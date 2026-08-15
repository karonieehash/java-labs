import java.io.*;
import java.util.*;
class std1
{
public static void main(String[ ] args)
{
int n,b,c,d;
Scanner tv=new Scanner(System.in);
for(int i=1;i<=99;i++ )
{n=i;
int sum=0,sum1=1;
while(n>0)
{
b=n%10;
sum=sum+b;
sum1=sum1*b;
n=n/10;
}
c=sum1+sum;
if(c==i)
{System.out.println(i);}
}
}}