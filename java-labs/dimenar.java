import java.io.*;
import java.util.*;
class dimenar
{
public static void main(String[ ] args)
{
int i,j;
Scanner tv=new Scanner(System.in);
int[][] a=new int[3][3];//1st row 2nd column
System.out.println("enter the values for 3X3 array");
for(i=0;i<3;i++)//row
{
for(j=0;j<3;j++)//column
{
a[i][j]=tv.nextInt();
}
}
System.out.println("array values");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(a[i][j]);


}
}


}}