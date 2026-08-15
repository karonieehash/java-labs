import java.io.*;
import java.util.*;
class dcal2
{
public static void main(String[ ] args)
{
int g,g1,g2,g3,g4,g44,g5,g6,g7,g8,g9,g10,g11;
int f=0,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f44=0,d;
Scanner tv=new Scanner(System.in);
System.out.println("enter the year ");
int a=tv.nextInt();
if(a%4==0&&a%100!=0||a%400==0)
{ d=366;}
else
{d=365;}
System.out.println("enter the month ");
int b=tv.nextInt();
System.out.println("enter the date of the month ");
int c=tv.nextInt();
int e1=31;
int e2=29;
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
System.out.println("the no of day "+g);
}
else if(b==2&&a%4==0&&a%100!=0||a%400==0)
{
g1=c;
f1=g1+e1;
System.out.println("the no of day "+f1);

}
else if(b==2)
{
g2=c;
f2=g2+e1;
System.out.println("the no of day "+f2);
}
else if(b==3)
{
g3=c;
if(d==366)
{
f3=g3+e1+e2;
}
else if(d==365)
{
f3=g3+e1+e3;
}

System.out.println("the no of day "+f3);
}
else if(b==4)
{
g4=c;
if(d==366)
{
f4=g4+e1+e2+e4;
}
else if(d==365)
{
f4=g4+e1+e3+e4;
}
System.out.println("the no of days remaining "+f4);
}
else if(b==5)
{
g44=c;
if(d==366)
{
f44=g44+e1+e2+e4+e5;
}
else if(d==365)
{
f44=g44+e1+e3+e4+e5;
}
System.out.println("the no of days remaining "+f44);

}
else if(b==6)
{
g5=c;
if(d==366)
{
f5=g5+e1+e2+e4+e5+e6;
}
else if(d==365)
{
f5=g5+e1+e3+e4+e5+e6;
}
System.out.println("the no of days remaining "+f5);

}
else if(b==7)
{
g6=c;
if(d==366)
{
f6=g6+e1+e2+e4+e5+e6+e7;
}
else if(d==365)
{
f6=g6+e1+e3+e4+e5+e6+e7;
}
System.out.println("the no of days remaining "+f6);

}
else if(b==8)
{
g7=c;
if(d==366)
{
f7=g7+e1+e2+e4+e5+e6+e7+e8;
}
else if(d==365)
{
f7=g7+e1+e3+e4+e5+e6+e7+e8;
}
System.out.println("the no of days remaining "+f7);

}
else if(b==9)
{
g8=c;
if(d==366)
{
f8=g8+e1+e2+e4+e5+e6+e7+e8+e9;
}
else if(d==365)
{
f8=g8+e1+e3+e4+e5+e6+e7+e8+e9;
}
System.out.println("the no of days remaining "+f8);

}
else if(b==10)
{
g9=c;
if(d==366)
{
f9=g9+e1+e2+e4+e5+e6+e7+e8+e9+e10;
}
else if(d==365)
{
f9=g9+e1+e3+e4+e5+e6+e7+e8+e9+e10;
}
System.out.println("the no of days remaining "+f9);

}
else if(b==11)
{
g10=c;
if(d==366)
{
f10=g10+e1+e2+e4+e5+e6+e7+e8+e9+e10+e11;
}
else if(d==365)
{
f10=g10+e1+e3+e4+e5+e6+e7+e8+e9+e10+e11;
}
System.out.println("the no of days remaining "+f10);
}
else if(b==12)
{
g11=c;
if(d==366)
{
f11=g11+e1+e2+e4+e5+e6+e7+e8+e9+e10+e11+e12;
}
else if(d==365)
{
f11=g11+e1+e3+e4+e5+e6+e7+e8+e9+e10+e11+e12;
}
System.out.println("the no of days remaining "+f11);
}
}}