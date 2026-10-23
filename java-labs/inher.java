//INHERITENCE IN JAVA
import java.util.Scanner;
class A{
    int add(int x,int y){
        Scanner tv=new Scanner(System.in);
        int d=x+y;
        return d;
    }
}
class B extends A{
    int mul(int x,int y){
        int c=x*y;
        return c;
    }
}
class inher{
    public static void main(String[] args) {
        B ob = new B();
        int h,j,k;
        h=ob.add(10,12);
        j=ob.mul(1111, 9999);
        System.out.println("sum "+h);
        System.out.println("multiplication "+j);
        k=ob.mul(100,12);
        System.out.println("multiplication "+k);

    }
}