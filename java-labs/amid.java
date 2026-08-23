import java.util.*;
class amid
{
public static void main(String[] args)
{
Scanner tv=new Scanner(System.in);
System.out.println("how much number should array hold");
int b=tv.nextInt();
int[] a=new int[b];
for(int i=0;i<b;i++)
{
a[i]=tv.nextInt();
}
if(b%2==0)
{
int c=b/2;
System.out.println("both "+a[c-1]+" and "+a[c]+" can be middle term");
}
else
{
int c=(b-1)/2;
System.out.println("the middle term in the array is "+a[c]);
}
}}