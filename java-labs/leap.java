import java.io.*;
import java.util.*;
class leap
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the year to be checked ");
int a=tv.nextInt();
if(a%4==0&&a%100!=0||a%400==0)
{
System.out.println(a+"   is a leap year");
}
else
{
System.out.println(a+"  is not  a leap year");
}
}}