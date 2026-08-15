import java.io.*;
import java.util.*;
class logic
{
public static void main(String[ ] args)
{
int a,b;
Scanner tv=new Scanner(System.in);
System.out.println("enter a number");
a=tv.nextInt();
System.out.println("enter a number");
b=tv.nextInt();
boolean c,c1,c2;
c=((a>b)&&(a<=b));
c1=((a<b)||(a>=b));
c2=!((a<=b)&&(a>=b));
System.out.println("c = "+c);
System.out.println("c1 = "+c1);
System.out.println("c2 = "+c2);
}}
