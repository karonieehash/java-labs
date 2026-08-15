import java.io.*;
import java.util.*;
class prime
{
public static void main(String[ ] args)
{
int a,c=0;
Scanner tv =new Scanner(System.in);
System.out.println("enter the number to check prime");
a=tv.nextInt();
for(int i=2;i<a;i++)
{
c=a%i;
if(c==0)
{
break;
}
}
if(c==0)
{

System.out.print("it is not  a prime ");

}
else
{
System.out.println("it is  a prime number");
}

}}