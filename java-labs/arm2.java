import java.io.*;
import java.util.*;
class arm2
{
public static void main(String[ ] args)
{
int b=0,c=0,x;
for(int i=1;i<=1000;i++)
{x=i;
int sum=0;
 while(x>0)
{
b=x%10;
c=b*b*b;
sum=sum+c;
x=x/10;
}
if(i==sum)
{
System.out.println(i);}
}
}}


