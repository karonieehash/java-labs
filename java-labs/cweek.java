import java.io.*;
import java.util.*;
class cweek
{
public static void main(String[ ] args)
{
int g,g1,g2,g3,g4,g44,g5,g6,g7,g8,g9,g10,g11;
int f=0,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f44=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter the month ");
int b=tv.nextInt();
System.out.println("enter the date of the month ");
int c=tv.nextInt();
int e1=31;
int e3=28;
int e4=31;
int e5=30;
int e6=31;
int e7=30;
int e8=31;
int e9=31;
int e10=30;
int e11=31;
int e12=30;
int e13=31;


 if(b==1)
{
g=c;
System.out.println("the no of week "+(g/7));
}
else if(b==2)
{
g2=c;
f2=g2+e1;
System.out.println("the no of week "+(f2/7));
}
else if(b==3)
{
g3=c;
f3=g3+e1+e3;
System.out.println("the no of week "+(f3/7));
}
else if(b==4)
{
g4=c;
f4=g4+e1+e3+e4;
System.out.println("the no of week "+(f4/7));
}
else if(b==5)
{
g44=c;
f44=g44+e1+e3+e4+e5;
System.out.println("the no of week "+(f44/7));
}
else if(b==6)
{
g5=c;
f5=g5+e1+e3+e4+e5+e6;
System.out.println("the no of week "+(f5/7));
}
else if(b==7)
{
g6=c;
f6=g6+e1+e3+e4+e5+e6+e7;
System.out.println("the no of week "+(f6/7));
}
else if(b==8)
{
g7=c;
f7=g7+e1+e3+e4+e5+e6+e7+e8;
System.out.println("the no of week"+(f7/7));
}
else if(b==9)
{
g8=c;
f8=g8+e1+e3+e4+e5+e6+e7+e8+e9;
System.out.println("the no of week "+(f8/7));
}
else if(b==10)
{
g9=c;
f9=g9+e1+e3+e4+e5+e6+e7+e8+e9+e10;
System.out.println("the no of week"+(f9/7));
}
else if(b==11)
{
g10=c;
f10=g10+e1+e3+e4+e5+e6+e7+e8+e9+e10+e11;
System.out.println("the no of week "+(f10/7));
}
else if(b==12)
{
g11=c;
f11=g11+e1+e3+e4+e5+e6+e7+e8+e9+e10+e11+e12;
System.out.println("the no of week "+(f11/7));
}
}}
