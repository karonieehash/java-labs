
import java.util.Scanner;

class a{
    int a,b;
}
class b{
    int a,b,c;
}
class c{
    int a,b;
}
class d{
    public static void main(String[] args) {
        Scanner tv= new Scanner(System.in);
        a ob=new a();
        System.out.println("program to find biggest number betweeen two numbers");
        System.out.println("enter a");
        ob.a=tv.nextInt();
        System.out.println("enter b");
        ob.b=tv.nextInt();
        if(ob.a>ob.b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        System.out.println("program to find biggest number betweeen three numbers");
        b obj=new b();
        System.out.println("enter a");
        obj.a=tv.nextInt();
        System.out.println("enter b");
        obj.b=tv.nextInt();
        System.out.println("enter c");
        obj.c=tv.nextInt();
        if(obj.a==obj.b && obj.b==obj.c && obj.a==obj.c){
            System.out.print("three numbers are equal");
        }
        else if(obj.a==obj.b && obj.c<obj.b){
            System.out.println("a and b are equal and great");
        }
        else if(obj.a==obj.b && obj.c>obj.b){
            System.out.println("c is  great");
        }
        else if( obj.b==obj.c && obj.a>obj.c){
            System.out.print("a is greater");
        }
        else if( obj.b==obj.c && obj.a<obj.c){
            System.out.print("b and c are equal and greater");
        }
        else if(obj.a==obj.c && obj.b<obj.c){
            System.out.println("a and c are equal and greater");
        }
        else if(obj.a==obj.c && obj.b>obj.c){
            System.out.println("b is  greater");
        }
        else if(obj.a>obj.b && obj.a>obj.c){
            System.out.println("a is greater");
        }
        
        else if(obj.b>obj.a && obj.b>obj.c){
            System.out.println("b is greater");
        }
        
        else if(obj.c>obj.b && obj.c>obj.a){
            System.out.println("c is greater");
        }

        System.out.println("program to tell weathet it is a even number or not");
        c obje=new c();
        System.out.println("enter a");
        obje.a=tv.nextInt();
        System.out.println("enter b");
        obje.b=tv.nextInt();
        if(obje.a%2==0 && obje.b%2==0 ){
            System.out.println("a and b is a even number");
        }
        else if(obje.a%2==0){
            System.out.println("a is a even number");
        }
        
        else if(obje.b%2==0){
            System.out.println("b is a even number");
        }
    }
}
