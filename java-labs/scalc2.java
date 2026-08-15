import java.io.*;
import java.util.*;
class scalc2
{
public static void main(String[ ] args)
{
Scanner tv= new Scanner(System.in);
System.out.println("------------------------------------------------------------------ ");
System.out.println("       choice                                action            ");
System.out.println("------------------------------------------------------------------");
System.out.println("           +                  |               add               ");
System.out.println("           -                  |               sub              ");
System.out.println("           *                  |               mul              ");
System.out.println("           /                  |               div               ");
System.out.println("           %                  |               mod               ");
System.out.println("--------------------------------------------------------------------  ");
System.out.println("enter the choice");
char a=tv.next().charAt(0);
System.out.println("enter the 1st number");
int b=tv.nextInt();
System.out.println("enter the 2nd number");
int c=tv.nextInt();
switch(a)
{
case '+':
System.out.print("the added value is "+ (b+c));
break;
case '-':
System.out.print("the subracted value is "+ (b-c));
break;
case '*':
System.out.print("the multiplied value is "+ (b*c));
break;
case '/':
System.out.print("the divided value is "+ (b/c));
break;
case '%':
System.out.print("the remainder is "+ (b%c));
break;

}
}}

