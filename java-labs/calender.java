import java.io.*;
import java.util.*;
class calender
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the year ");
int a=tv.nextInt();
System.out.println("enter the month in number ");
int b=tv.nextInt();
if(b==1)
{ System.out.println("january 31 days");}
else if(b==2&&a%4==0&&a%100!=0||a%400==0)
{ System.out.println("feburary 29 days");}
else if(b==2)
{ System.out.println("feburary 28 days");}
else if(b==3)
{ System.out.println("march 31 days");}
else if(b==4)
{ System.out.println("april 30 days");}
else if(b==5)
{ System.out.println("may 31 days");}
else if(b==6)
{ System.out.println("june 30 days");}
else if(b==7)
{ System.out.println("july 31 days");}
else if(b==8)
{ System.out.println("august 31 days");}
else if(b==9)
{ System.out.println("september 30 days");}
else if(b==10)
{ System.out.println("october 31 days");}
else if(b==11)
{ System.out.println("november 30 days");}
else if(b==12)
{ System.out.println("december 31 days");}
}}

