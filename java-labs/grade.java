import java.io.*;
import java.util.*;
class grade
{
public static void main(String[ ] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("enter the english mark ");
int a=tv.nextInt();
System.out.println("enter the maths mark ");
int b=tv.nextInt();
System.out.println("enter the computer science mark ");
int c=tv.nextInt();
System.out.println("enter the chemistry mark ");
int d=tv.nextInt();
System.out.println("enter the physics mark ");
int e=tv.nextInt();
int f=(a+b+c+d+e)/5;
if(f>=90)
{
System.out.println("o grade");
}
else if(f<90&&f>=75)
{
System.out.println("a grade");
}
else if(f<75&&f>=60)
{
System.out.println("b grade");
}
else if(f<60&&f>=45)
{
System.out.println("c grade");
}
else if(f<45)
{
System.out.println("d grade");
}
}}
