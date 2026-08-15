import java.io.*;
import java.util.*;
class insar
{
public static void main(String[ ] args)
{
int i,d,f=0,n,h;
Scanner tv=new Scanner(System.in);
System.out.println("enter how many number should the array carry");
n=tv.nextInt();
System.out.println("enter "+n+" numbers");
int[] a=new int[n+1];
for(i=0;i<n;i++)
{
a[i]=tv.nextInt();
}
System.out.println("enter number to be inserted");
int e=tv.nextInt();

System.out.println("enter number  index to be inserted");
d=tv.nextInt();
for(i=n;i>d;i--)
{a[i]=a[i-1];}
a[d]=e;
System.out.println("array after inserted");
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}
}}
