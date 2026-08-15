import java.io.*;
import java.util.*;
class dis
{public static void main(String[ ] args)
{int n,b,c,count=0,x,y;
double sum=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter an number");
n=tv.nextInt();
x=n;
y=n;
while(n>0)
{
b=n%10;
count++;
n=n/10;
}
while(x>0)
{c=x%10;
sum=Math.pow(c,count)+sum;
count--;
x=x/10;
}
if(sum==y)
{System.out.println(y+"  is a disarium number");}
else
{System.out.println(y+" it is not a disarium number");}

}}
