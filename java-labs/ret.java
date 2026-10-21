import java.util.Scanner;
class a{
    int add(int x){
        Scanner tv = new Scanner(System.in);
        System.out.println("enter the numbers in the array");
        int [] b=new int[x];
        for(int i=0;i<x;i++){
            b[i]=tv.nextInt();
        }
        System.out.println("enter the numbers in the array");
        int [] c=new int[x];
        for(int i=0;i<x;i++){
            c[i]=tv.nextInt();
        }
        int sum =0;
        for(int i=0;i<x;i++){
            sum=b[i]+c[i]+sum;
        }
        return sum;
    }
    int arrAdd1(){
        Scanner tv = new Scanner(System.in);
        System.out.println("enter how many numbers should your array contain");
        int x=tv.nextInt();
        int [] b=new int[x];
        System.out.println("enter the numbers in the array");
        for(int i=0;i<x;i++){
            b[i]=tv.nextInt();
        }
         int sum =0;
        for(int i=0;i<x;i++){
            sum=b[i]+sum;
        }
        return sum;

    }
}
class ret{
    public static void main(String[] args) {
        a ob= new a();
        // Scanner tv = new Scanner(System.in);
        // System.out.println("enter how many numbers should your array contain");
        // int x=tv.nextInt();
        int c= ob.arrAdd1();
        System.out.print("the sum of the : "+c);

        
    }
}