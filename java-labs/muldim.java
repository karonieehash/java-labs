import java.io.*;
import java.util.*;
class muldim
{
public static void main(String[ ] args)
{
int i,j,c,r,c2,r2,k;
Scanner tv=new Scanner(System.in);
System.out.println("how many rows ");
r=tv.nextInt();
System.out.println("how many columns ");
c=tv.nextInt();
System.out.println("enter the values for "+r+"X"+c+" for 1st array");
int[][] a=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=tv.nextInt();
}
}
System.out.println("note that 1st array column and 2nd array row should be equal for multiplication ");
System.out.println("how many rows ");
r2=tv.nextInt();
System.out.println("how many columns ");
c2=tv.nextInt();
System.out.println("enter the values for "+r2+"X"+c2+" for 2nd array");
if(c!=r2)
{System.out.print("multiplication of matrix is not possible column and row should be equal");}
else{
int[][] b=new int[r2][c2];
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=tv.nextInt();
}
}
int[][] h=new int[r][c2];
System.out.println("array after calculated");
for(i=0;i<r;i++)
{
for(j=0;j<c2;j++)
{h[i][j]=0;
for(k=0;k<c;k++)
{h[i][j]=h[i][j]+(a[i][k]*b[k][j]);}
System.out.print(h[i][j]+" ");
}
System.out.println();
}
}
}}

