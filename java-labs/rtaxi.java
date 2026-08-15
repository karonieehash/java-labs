import java.io.*;
import java.util.*;
class rtaxi
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the number of days to be rent ");
int a=tv.nextInt();
int b=0;
if(a<=10)
{
System.out.println("the total amount  "+a*5000);}
else if(a>10&&a<=15)
{
b=50000;
System.out.println("the total amount  "+(b+(a-10)*4000));}
else if(a>15&&a<=20)
{
b=70000;
System.out.println("the total amount  "+(b+(a-15)*3000));}
else if(a>20)
{
b=85000;
System.out.println("the total amount  "+(b+(a-20)*2000));}
}
}