import java.io.*;
import java.util.*;
class wsod
{
public static void main(String[ ] args)
{int n,b,sum=0;
Scanner tv=new Scanner(System.in);
System.out.println("enter a number");
n=tv.nextInt();
while(n>0)
{
b=n%10;
sum=sum+b;
n=n/10;
}
System.out.println("sum of the digits "+sum);

}}