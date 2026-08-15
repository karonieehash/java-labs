import java.io.*;
import java.util.*;
class arrayfound
{
public static void main(String[ ] args)
{
int i,z=0,j,t=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter  5 numbers");
int[] a=new int[5];
for(i=0;i<5;i++)
{
a[i]=tv.nextInt();
}
System.out.println("enter the number to be checked");
j=tv.nextInt();
for(i=0;i<5;i++)
{ t=0;
if(a[i]==j)
{t=t+1;}
else
{t=t+2;}
}
if(t==1)
{System.out.println("the number found in the array");}
else
{System.out.println("not found");}

}}