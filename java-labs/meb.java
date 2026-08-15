import java.io.*;
import java.util.*;
class meb
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the current month reading ");
int a=tv.nextInt();
System.out.println("enter the previous month reading ");
int b=tv.nextInt();
int c=a-b;
System.out.println("the units used "+ c);
if(c<=100)
{
System.out.println("the amount need to be paid is zero");}
else if(c>100&&c<=200)
{System.out.println("the amount need to be paid is "+((c-100)*2));}
else if(c>200&&c<=300)
{System.out.println("the amount need to be paid is "+(200+(c-200)*4));}
else if(c>300&&c<=400)
{System.out.println("the amount need to be paid is "+(600+(c-300)*6));}
else if(c>400&&c<=500)
{System.out.println("the amount need to be paid is "+(1200+(c-400)*8));}
else if(c>500)
{System.out.println("the amount need to be paid is "+(2000+(c-500)*12));}
}}


