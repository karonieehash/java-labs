import java.io.*;
import java.util.*;
class drev
{
public static void main(String[ ] args)
{
int b,n,sum=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number");
n=tv.nextInt();
do
{b=n%10;
sum=sum*10+b;
n=n/10;
}while(n>0);
System.out.println(sum);
}}
