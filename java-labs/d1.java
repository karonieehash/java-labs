
import java.util.Scanner;

class a{
    int b;
    int a[];
}
class b{
    int b,c;
    int a[][];
}
class d1{
    public static void main(String[] args) {
        Scanner tv=new Scanner(System.in);
        a ob=new a();
        System.out.println("enter how many numbers u want in an array");
        ob.b=tv.nextInt();
        ob.a= new int [ob.b];
        System.out.println("enter the numbers u want in an array");

        for (int i = 0; i < ob.b; i++) {
            ob.a[i]=tv.nextInt();            
        }
        for (int i = 0; i < ob.b; i++) {
            System.out.print(ob.a[i]+" ");            
        }
        System.out.println();
        b obj=new b();
        System.out.println("enter the number of rows u want in the array");
        obj.b=tv.nextInt();
        System.out.println("enter the number of columns u want in the array");
        obj.c=tv.nextInt();
        obj.a=new int[obj.b][obj.c];
        System.out.println("enter the numbers in the array");
        for(int i=0;i<obj.b;i++){
            for (int j = 0; j <obj.c; j++) {
                obj.a[i][j]=tv.nextInt();
            }
        }
        System.out.println("output array");
        for(int i=0;i<obj.b;i++){
            for (int j = 0; j <obj.c; j++) {
                System.out.print(obj.a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("90 degree array");
        for(int j = 0; j <obj.c; j++){
            for (int i=obj.b-1;i>=0;i--) {
                System.out.print(obj.a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<obj.b;i++){
            for (int j = 0; j <obj.c/2; j++) {
                int temp = obj.a[i][j];
                obj.a[i][j]=obj.a[i][obj.c-1-j];
                obj.a[i][obj.c-1-j]=temp;
            }
        }
        for(int i=0;i<obj.b;i++){
            for (int j = 0; j <obj.c; j++) {
                System.out.print(obj.a[i][j]+" ");
            }
            System.out.println();
        }
    


    }
}