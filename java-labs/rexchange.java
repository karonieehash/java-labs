import java.io.*;
import java.util.*;
class rexchange
{
public static void main(String[ ] args)
{
int i,j,k,r,c;
Scanner tv=new Scanner(System.in);
System.out.println("how many row u need to have in array");
r=tv.nextInt();
System.out.println("how many column u need to have in array");
c=tv.nextInt();
System.out.println("enter the array");
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=tv.nextInt();
}
}
System.out.println("row and column swapped array");
int b[][]=new int[c][r];
for(i=0;i<c;i++)
{
for(j=0;j<r;j++)
{
b[i][j]=a[j][i];
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




