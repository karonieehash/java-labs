import java.io.*;
import java.util.*;
class logic2
{
public static void main(String[ ] args)
{
int a,b,c,d;
Scanner tv=new Scanner(System.in);
System.out.println("enter a number");
a=tv.nextInt();
System.out.println("enter a number");
b=tv.nextInt();
System.out.println("enter a number");
c=tv.nextInt();
System.out.println("enter a number");
d=tv.nextInt();
a+=5;
b-=10;
c*=23;
d/=2;
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
a=b;
c=d;
System.out.println("a = " + a);
System.out.println("c = " + c);

}}
