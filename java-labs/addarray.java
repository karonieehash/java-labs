import java.io.*;
import java.util.*;
class addarray
{
public static void main(String[] args)
{
int i,k;
Scanner tv=new Scanner(System.in);
System.out.println("enter 5 numbers");
int a[]=new int[5];
for(i=0;i<5;i++)
{
a[i]=tv.nextInt();}
System.out.println("enter 5 numbers");
int b[]=new int[5];
int j;
for(j=0;j<5;j++)
{
b[j]=tv.nextInt();}
System.out.println("added array");
int c[]=new int[5];
for(k=0;k<5;k++)
{
c[k]=a[k]+b[k];
System.out.println(c[k]);
}
}}