import java.io.*;
import java.util.*;
class salary
{
public static void main(String[ ] args)
{
int a,b,c,d,e,f,g,h,i;
Scanner tvk=new Scanner(System.in);
System.out.println("enter the basic pay ");
a=tvk.nextInt();
System.out.println("enter the hra");
b=tvk.nextInt();
System.out.println("enter the ta ");
c=tvk.nextInt();
System.out.println("enter the da");
d=tvk.nextInt();
System.out.println("enter the esi ");
e=tvk.nextInt();
System.out.println("enter the pf");
f=tvk.nextInt();
g=a+b+c+d;
h=e+f;
i=g-h;
System.out.println("the total salary "+ (g+h));
System.out.println("the net salary is   "+i);
}}