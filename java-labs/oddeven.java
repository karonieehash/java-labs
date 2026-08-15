import java.io.*;
import java.util.*;
class oddeven
{
public static void main (String[] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number to be check ");
int a=tv.nextInt();
if (a%2==0)
{
System.out.println("the given number is an even number ");
}
else
{
System.out.println("the given number is not an even number ");
}
}}