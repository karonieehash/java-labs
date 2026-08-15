import java.io.*;
import java.util.*;
class rapido1
{
public static void main(String[ ] args)
{
 Scanner km=new Scanner(System.in);
 float a,b,c;
 System.out.println("the starting reading bike");
 a=km.nextFloat();
 System.out.println("the ending reading of bike");
 b=km.nextFloat();
 c=b-a;
 System.out.println("the km traveled  is   "+c+" km");
 System.out.println("the fee for the travel is  "+(c*5)+" rs");

}}