import java.io.*;
import java.util.*;
class delar
{
public static void main(String[ ] args)
{
int i,d,f=0,n;
Scanner tv=new Scanner(System.in);
System.out.println("enter how many number should the array carry");
n=tv.nextInt();
System.out.println("enter "+n+" numbers");
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=tv.nextInt();
}
System.out.println("enter number  index to be deleted");
d=tv.nextInt();
for(i=0;i<n;i++)
{int t=0;
if(d==i)
{
int j=n-1;
System.out.println("array after deleted");
t=a[i];
a[i]=a[j];
a[j]=t;
for(i=0;i<j;i++)
{
System.out.println(a[i]);
}

}
else
{f++;}
}
if(f==n)
{System.out.println("enter the correct index");}
}}
