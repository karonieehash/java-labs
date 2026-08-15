import java.io.*;
import java.util.*;
class merge
{
public static void main(String[ ] args)
{
int i;
Scanner tv=new Scanner(System.in);
System.out.println("enter 5 numbers");
int[] a=new int[5];
for(i=0;i<5;i++)
{
a[i]=tv.nextInt();
}
System.out.println("enter 5 numbers");
int[] b=new int[5];
for(i=0;i<5;i++)
{
b[i]=tv.nextInt();
}
int[] c=new int[10];
int j;
for(j=0;j<5;j++)
{c[j]=a[j];
}
for(j=5;j<10;j++)
{
c[j]=b[j-5];
}
System.out.println("the merged array");

for(j=0;j<10;j++)
{System.out.println(c[j]);}
}}



