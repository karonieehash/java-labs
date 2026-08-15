import java.io.*;
import java.util.*;
class rev
{
public static void main(String[ ] args)
{
int n,b,sum=0,c=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter an number");
n=tv.nextInt();
while(n>0)
{
b=n%10;
c=c*10+b;
n=n/10;
}
System.out.println(c);
}}