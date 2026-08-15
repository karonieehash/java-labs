import java.io.*;
import java.util.*;
class tnum1
{
public static void main(String[ ] args)
{

Scanner tv=new Scanner(System.in);
System.out.println("1 to 100 perfect numbers");
for(int i=1;i<=100;i++)
{int c=0;
for(int j=1;j<i;j++)
{
if(i%j==0)
{c=c+j;}
}
if(c==i)
{
System.out.println(c);
}
}
}}