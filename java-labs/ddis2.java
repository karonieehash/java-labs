import java.io.*;
import java.util.*;
class ddis2
{
public static void main(String[ ] args)
{
int b,c,n,x,y;
Scanner tv=new Scanner(System.in);
for(int i=1;i<=1000;i++)
{int sum1=0;
double sum=0;
n=i;
x=i;
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
if(i==sum)
{System.out.println(i);}
}

}}