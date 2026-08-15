import java.io.*;
import java.util.*;
class dis6
{
public static void main(String[ ] args)
{
int x,n,b,c,y;
for(int i=1;i<=1000;i++)
{
double sum=0;
int sum1=0;
n=i;
x=i;
y=i;
while(n>0)
{
b=n%10;
sum1++;
n=n/10;
}
while(x>0)
{
c=x%10;
sum=Math.pow(c,sum1)+sum;
x=x/10;
}
if(y==sum)
{System.out.println(i);}
}
}}