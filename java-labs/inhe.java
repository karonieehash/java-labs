import java.util.Scanner;
class A{
    int add(int x,int y){
        int d=x+y;
        return d;
    }
}
class B extends A{
    int b,c,n,sum1=0,d,y,x;
    double sum=0;
    boolean dis(){
        Scanner tv=new Scanner(System.in);
        System.out.println("enter the number to check weather it is a disoriam number or not");
        x=tv.nextInt();
        y=x;
        n=x;
        c=x;
        while(n>0){
            b=n%10;
            sum1++;
            n=n/10;
        }
        while(c>0){
            d=c%10;
            sum=Math.pow(d,sum1)+sum;
            sum1--;
            c=c/10;
        }
        if(y==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
class inhe{
    public static void main(String[] args) {
        B ob=new B();
        boolean b=ob.dis();
        if(b){
            System.out.println("it is a dissarium number");
        }
        else if(!b){
            System.out.println("it is not a dissarium number");
        }
        System.out.print("addition prg "+ob.add(5000,82560));


    }
}