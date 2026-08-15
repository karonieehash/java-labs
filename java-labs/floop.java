import java.io.*;
import java.util.*;
class floop
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number of the table");
int a=tv.nextInt();
System.out.println("tell the limit");
int b=tv.nextInt();
for(int i=1;i<=b;i++)
{
System.out.println(a+" * "+i+" = "+ (a*i));
}
}}