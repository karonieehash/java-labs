import java.io.*;
import java.util.*;
class dimenaradd
{
public static void main(String[ ] args)
{
int i,j,c,r;
Scanner tv=new Scanner(System.in);
System.out.println("how many rows ");
r=tv.nextInt();
System.out.println("how many columns ");
c=tv.nextInt();
int[][] a=new int[r][c];
System.out.println("enter the values for "+r+"X"+c+" for 1st array");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=tv.nextInt();
}
}
int[][] b=new int[r][c];
System.out.println("enter the values for "+r+"X"+c+" for 2nd array");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=tv.nextInt();
}
}
System.out.println("enter the choice + or -");
char g=tv.next().charAt(0);
int[][] h=new int[r][c];
System.out.println("array after calculated");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{switch(g)
{case '+':
h[i][j]=a[i][j]+b[i][j];
System.out.println(h[i][j]);
break;
case '-':
h[i][j]=a[i][j]-b[i][j];
System.out.println(h[i][j]);
break;
case '*':
h[i][j]=a[i][j]*b[i][j];
System.out.println(h[i][j]);
break;
case '/':
h[i][j]=a[i][j]/b[i][j];
System.out.println(h[i][j]);
break;}
}
}
}}