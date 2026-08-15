import java.io.*;
import java.util.*;
class arm
{
public static void main(String[ ] args)
{
int n,b=0,sum=0,c=0,x;
Scanner tv=new Scanner(System.in);
System.out.println("enter an number");
n=tv.nextInt();
x=n;
while(n>0)
{
b=n%10;
c=b*b*b;
sum=sum+c;
n=n/10;
}

if(x==sum)
{
System.out.println(x+" is an armstrong number ");}
else
{System.out.println("it is not an armstrong number because the sum is "+sum);}

}}
