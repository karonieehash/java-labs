import java.io.*;
import java.util.*;
class tax
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("there is no tax up to 250000 ");
System.out.println("enter the tax percent 250000 to 500000 ");
int d=tv.nextInt();
System.out.println("enter the tax percent 500000 to 1000000 ");
int d1=tv.nextInt();
System.out.println("enter the tax percent 1000000 to 2000000 ");
int d2=tv.nextInt();
System.out.println("enter the tax percent 2000000 to 3000000 ");
int d3=tv.nextInt();
System.out.println("enter the tax percent 3000000 to 4000000 ");
int d4=tv.nextInt();
System.out.println("enter the tax percent for more than 4000000 ");
int d5=tv.nextInt();
System.out.println("enter the basic pay  ");
int a=tv.nextInt();
System.out.println("enter the allowance ");
int b=tv.nextInt();
System.out.println("enter the deduction ");
int c=tv.nextInt();
int net=(a+b)-c;
if(net<=250000)
{
System.out.println("the tax is zero");}
else if(net>250000&&net<=500000)
{System.out.println("the tax is "+ ((a-250000)*d/100));}
else if(net>500000&&net<=1000000)
{System.out.println("the tax is "+ ((250000*d/100)+((a-500000)*d1/100)));}
else if(net>1000000&&net<=2000000)
{System.out.println("the tax is "+ ((500000*d1/100)+(250000*d/100)+((a-1000000)*d2/100)));}
else if(net>2000000&&net<=3000000)
{System.out.println("the tax is "+ ((500000*d1/100)+(250000*d/100)+(1000000*d2/100)+((a-2000000)*d3/100)));}
else if(net>3000000&&net<=4000000)
{System.out.println("the tax is "+ ((500000*d1/100)+(250000*d/100)+(1000000*d2/100)+(2000000*d3/100)+((a-3000000)*d4/100)));}
else if(net>4000000)
{System.out.println("the tax is "+ ((500000*d1/100)+(250000*d/100)+(1000000*d2/100)+(2000000*d3/100)+(3000000*d4/100)+((a-4000000)*d5/100)));}
}}






