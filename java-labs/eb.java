import java.io.*;
import java.util.*;
class eb
{
public static void main(String[ ] args)
{
Scanner vk=new Scanner(System.in);
 float a,b,c;
 System.out.println("enter the previous month reading " );
 a=vk.nextFloat();
System.out.println("enter the current month reading " );
 b=vk.nextFloat();
c=b-a;
System.out.println("the total reading "+c+" units" );
System.out.println("the bill for the units used  "+(c*2)+" rupees" );
}}

 