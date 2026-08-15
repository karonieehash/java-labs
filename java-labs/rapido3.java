import java.io.*;
import java.util.*;
class rapido3
{
public static void main(String[ ] args)
{
Scanner tvk=new Scanner(System.in);
int a,b,c,d;
System.out .print("enter the starting reading of the km   ");
a=tvk.nextInt();
System.out.print("enter the ending reading of the km   ");
b=tvk.nextInt();
System.out.print("enter the rate per km    ");
c=tvk.nextInt();
d=b-a;
System.out.println("the km travelled "+ d);
System.out.println("the expence to travel  "+(c*d));
}}


