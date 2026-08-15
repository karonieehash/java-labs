import java.io.*;
import java.util.*;
class addarray1
{
public static void main(String[] args)
{
int i,k,z,n;
Scanner tv=new Scanner(System.in);
System.out.println("enter how much numbers should all array carry");
z=tv.nextInt();
System.out.println("enter "+z+" numbers");
int a[]=new int[z];
for(i=0;i<z;i++)
{
a[i]=tv.nextInt();}
System.out.println("enter "+z+" numbers");


int b[]=new int[z];
int j;
for(j=0;j<z;j++)
{
b[j]=tv.nextInt();}

System.out.println("calculated array");
int c[]=new int[z];
char g;
System.out.println("enter the choice + or - or * or / ");
g=tv.next().charAt(0);

for(k=0;k<z;k++)
{
switch(g)
{case '+':
c[k]=a[k]+b[k];
System.out.println(c[k]);
break;
case '-':
c[k]=a[k]-b[k];
System.out.println(c[k]);
break;
case '*':
c[k]=a[k]*b[k];
System.out.println(c[k]);
break;
case '/':
c[k]=a[k]/b[k];
System.out.println(c[k]);
break;}
}
}}