import java.util.*;
class demo{
    void one(){
        Scanner tv = new Scanner(System.in);
        System.out.println("enter how many numbers should your array contain");
        int x=tv.nextInt();
        int [] b=new int[x];
        System.out.println("enter the numbers in the array");
        for(int i=0;i<x;i++){
            b[i]=tv.nextInt();
        }
        System.out.println();
    }
    void one(int x,int y){
        if(x%2==0){
            System.out.println(x+" it is a even number");
        }
        else if(y%2==0){
            System.out.println(y+" it is a even number");
        }
        else if(x%2==0&&y%2==0){
            System.out.println("both are even number");
        }
        else{
            System.out.println("both are not a even number");
        }
    }
    void one(double x,double y){
        double sum =Math.pow(x,y);
        double sum1 =Math.pow(y,x);
        System.out.print(sum+" "+sum1);
    }
}
class movd{
    public static void main(String[] args) {
        demo ob = new demo();
        ob.one();
        ob.one(5,6);
        ob.one(12.4,8.6);
    }
}