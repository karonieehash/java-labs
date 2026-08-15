import java.io.*;
import java.util.*;
class syr
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the year");
int a=tv.nextInt();
System.out.println("enter the month in number");
int b=tv.nextInt();
System.out.println("enter the date");
int c=tv.nextInt();
int td=0;
switch(b)
{
case 1:
td=0;
break;
case 2:
td=31;
break;
case 3:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29;}
else
{td=31+28;}
break;
case 4:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31;}
else
{td=31+28+31;}
break;
case 5:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30;}
else
{td=31+28+31+30;}
break;
case 6:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31;}
else
{td=31+28+31+30+31;}
break;
case 7:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30;}
else
{td=31+28+31+30+31+30;}
break;
case 8:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30+31;}
else
{td=31+28+31+30+31+30+31;}
break;
case 9:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30+31+31;}
else
{td=31+28+31+30+31+30+31+31;}
break;
case 10:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30+31+31+30;}
else
{td=31+28+31+30+31+30+31+31+30;}
break;
case 11:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30+31+31+30+31;}
else
{td=31+28+31+30+31+30+31+31+30+31;}
break;
case 12:
if(a%4==0&&a%100!=0||a%400==0)
{td=31+29+31+30+31+30+31+31+30+31+30;}
else
{td=31+28+31+30+31+30+31+31+30+31+30;}
break;
}
td=td+c;
System.out.println("the total number of days is "+td);
}}
