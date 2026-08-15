import java.io.*;
import java.util.*;
class rcalen
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the month in number");
int a=tv.nextInt();
if(a>12)
{
System.out.println("error there are only 12 months");}
System.out.println("enter the date");
int b=tv.nextInt();
int td=0;
if(a==1)
{td=0;}
else if(a==2)
{td=31;}
else if(a==3)
{td=28+31;}
else if(a==4)
{td=31+28+31;}
else if(a==5)
{td=31+28+31+30;}
else if(a==6)
{td=31+28+31+30+31;}
else if(a==7)
{td=31+28+31+30+31+30;}
else if(a==8)
{td=31+28+31+30+31+30+31;}
else if(a==9)
{td=31+28+31+30+31+30+31+31;}
else if(a==10)
{td=31+28+31+30+31+30+31+31+30;}
else if(a==11)
{td=31+28+31+30+31+30+31+31+30+31;}
else if(a==12)
{td=31+28+31+30+31+30+31+31+30+31+30;}
td=td+b;
int re=td%7;
if(a<=12)
{
if(re==1)
{System.out.println("the day is:   sunday");}
else if(re==2)
{System.out.println("the day is:   monday");}
else if(re==3)
{System.out.println("the day is:   tuesday");}
else if(re==4)
{System.out.println("the day is:   wednesday");}
else if(re==5)
{System.out.println("the day is:   thursday");}
else if(re==6)
{System.out.println("the day is:   friday");}
else if(re==0)
{System.out.println("the day is:   saturday");}
}
else 
{
System.out.println("error there are only 12 months");}

}}







