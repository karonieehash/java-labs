import java.io.*;
import java.util.*;
class current
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the current reading ");
int a=tv.nextInt();
System.out.println("enter the previous  reading ");
int b=tv.nextInt();
int c=a-b;
System.out.println("the units used  "+c);
if (c<=100)
{
System.out.println("the bill is  "+c*2);
}
else if (c>100&&c<=200)
{
System.out.println("the bill is  "+c*4);
}
else if (c>200&&c<=300)
{
System.out.println("the bill is  "+c*6);
}
else if (c>300&&c<=400)
{
System.out.println("the bill is  "+c*8);
}
else
{
System.out.println("the bill is "+c*10);
}
}}