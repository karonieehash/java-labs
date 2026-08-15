import java.io.*;
import java.util.*;
class ninty
{
public static void main(String[ ] args)
{
int i,j,k,r,c;
Scanner tv=new Scanner(System.in);
System.out.println("enter the number of row u want  in the array");
r=tv.nextInt();
System.out.println("enter the number of column u want  in the array");
c=tv.nextInt();
System.out.println("enter the numbers of the array");
int[][] a=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=tv.nextInt();
}
}
int[][] b=new int[c][r];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[j][r-1-i]=a[i][j];
}
}
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}}
