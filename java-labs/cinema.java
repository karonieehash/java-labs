import java.io.*;
import java.util.*;
class cinema
{
public static void main(String[ ] args)
{
int a,b,c,d,e,f,g,h,i;
Scanner tv=new Scanner(System.in);
System.out.println("how many tickets sold for 50 rupees out of 100");
a=tv.nextInt();
System.out.println("how many tickets sold for 30 rupees out of 100");
b=tv.nextInt();
System.out.println("how many tickets sold for 10 rupees out of 100");
c=tv.nextInt();
d=a*50;
e=b*30;
f=c*10;
g=(100-a)*50;
h=(100-b)*30;
i=(100-c)*10;
System.out.println("total sales "+(d+e+f));
System.out.println("total loss  "+(g+h+i));
System.out.println("total tickets not sold for 50 rupees "+(100-a));
System.out.println("total tickets  not sold for 30 rupees "+(100-b));
System.out.println("total tickets  not sold for 20 rupees "+(100-c));


}}
