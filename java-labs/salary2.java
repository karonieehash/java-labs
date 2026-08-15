import java.io.*;
import java.util.*;
class salary2
{
public static void main(String[ ] args)
{
int a,b,c,d,e,f,g,h,i;
Scanner tvk=new Scanner(System.in);
System.out.println("enter the basic pay ");
a=tvk.nextInt();
b=a*3/100;
c=a*2/100;
d=a*1/100;
e=a*2/100;
f=a*1/100;
h=a+b+c+d;
i=e+f;
g=h-i;
System.out.println(" the hra is 3% of basic pay which is  "+b);
System.out.println("the ta is 2% of basic pay which is  "+c);
System.out.println("the da is 1% of basic pay which is "+d);
System.out.println("the esi is 2% of basic pay which is  "+e);
System.out.println("the pf is 1% of basic pay which is  "+f);
System.out.print("the net salary is "+g);
}}