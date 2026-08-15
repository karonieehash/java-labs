import java.io.*;
import java.util.*;
class perfect
{
public static void main(String[ ] args)
{
int a,c=0,d=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
a=tv.nextInt();
for(int i=1;i<a;i++)
{
c=a%i;
if(c==0)
{d=d+i;}
}

if(a==d)
{System.out.println("it is a perfect number");}
else
{System.out.println("it is not a perfect number");}
}}