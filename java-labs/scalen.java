import java.io.*;
import java.util.*;
class scalen
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the month in number");
int a=tv.nextInt();
System.out.println("enter the date");
int b=tv.nextInt();
int td=0;
switch(a)
{
case 1:
 td=0;
 break;
case 2:
 td=31;
break;
case 3:
td=31+28;
break;
case 4:
td=31+28+31;
break;
case 5:
td=31+28+31+30;
break;
case 6:
td=31+28+31+30+31;
break;
case 7:
 td=31+28+31+30+31+30;
 break;
case 8:
 td=31+28+31+30+31+30+31;
break;
case 9:
td=31+28+31+30+31+30+31+31;
break;
case 10:
td=31+28+31+30+31+30+31+31+30;
break;
case 11:
td=31+28+31+30+31+30+31+31+30+31;
break;
case 12:
td=31+28+31+30+31+30+31+31+30+31+30;
break;
}
td=td+b;
int re=td%7;
switch(re)
{
case 4:
System.out.println("sunday");
break;
case 5:
System.out.println("monday");
break;
case 6:
System.out.println("tuesday");
break;
case 0:
System.out.println("wednesday");
break;
case 1:
System.out.println("thursday");
break;
case 2:
System.out.println("friday");
break;
case 3:
System.out.println("saturday");
break;
}
}}