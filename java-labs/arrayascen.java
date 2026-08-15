import java.io.*;
import java.util.*;
class arrayascen
{
public static void main(String[ ] args)
{
int i,z,j,t=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number of numbers u want in array ");
z=tv.nextInt();
System.out.println("enter "+z+" numbers");
int[] a=new int[z];
for(i=0;i<z;i++)
{
a[i]=tv.nextInt();
}
for(i=0;i<z;i++)
{
for(j=i+1;j<z;j++)
{if(a[i]>a[j])
{t=a[i];
a[i]=a[j];
a[j]=t ;}
}
}
System.out.println("in acending order");

for(i=0;i<z;i++)
{
System.out.println(a[i]);
}

}}
