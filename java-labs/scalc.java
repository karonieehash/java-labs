import java.io.*;
import java.util.*;
class scalc
{
public static void main(String[ ] args)
{
Scanner tv= new Scanner(System.in);
System.out.println("------------------------------------------------------------------ ");
System.out.println("       choice                                action            ");
System.out.println("------------------------------------------------------------------");
System.out.println("           1                  |               add               ");
System.out.println("           2                  |               sub              ");
System.out.println("           3                  |               mul              ");
System.out.println("           4                  |               div               ");
System.out.println("--------------------------------------------------------------------  ");
System.out.println("enter the choice");
int a=tv.nextInt();
System.out.println("enter the 1st number");
int b=tv.nextInt();
System.out.println("enter the 2nd number");
int c=tv.nextInt();

switch(a)
{
case 1:
System.out.print("the added value is "+ (b+c));
break;
case 2:
System.out.print("the subracted value is "+ (b-c));
break;
case 3:
System.out.print("the multiplied value is "+ (b*c));
break;
case 4:
System.out.print("the divided value is "+ (b/c));
break;
}
}}







