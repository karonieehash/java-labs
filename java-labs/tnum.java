import java.io.*;
import java.util.*;
class tnum
{
public static void main(String[ ] args)
{
System.out.println("1 to 100 prime numbers");
for(int i=2;i<101;i++)
{int c=0;
 for(int j=1;j<=i;j++)
{
if(i%j==0)
{ c++;}
}
if(c==2)
System.out.println(i);
}
}}
