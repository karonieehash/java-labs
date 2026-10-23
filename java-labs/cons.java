
import java.util.Scanner;

class A{
    int a,b;
    public A() {
        Scanner tv = new Scanner(System.in);
        System.out.print("Enter an number");
        a=tv.nextInt();
        System.out.print("Enter an number");
        b=tv.nextInt();            
    }

}
class cons{
    public static void main(String[] args) {
        A ob= new A();
        if (ob.a%2==0 && ob.b%2==0) {
            System.out.println("both are a Even number");
        }
        else if(ob.a%2==0){
            System.out.println(ob.a+" is a Even number");
        }
        else if(ob.b%2==0){
            System.out.println(ob.b+" is a Even number");
        }
        
        else if(ob.a%2!=0 && ob.b%2!=0) {
            System.out.println("both are not a Even number");
        }
    }
}