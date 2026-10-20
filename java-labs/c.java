import java.util.Scanner;
class a{
    int a[][],b,c;
    void arrInput(){
        Scanner tv=new Scanner(System.in);
        System.out.println("number of rows u want in array");
        b=tv.nextInt();
        System.out.println("number of columns u want in array");
        c=tv.nextInt();
        a=new int[b][c];
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                a[i][j]=tv.nextInt();
            }
        }

    }
}
class d{
    int b,c,n,sum1=0,x,y,d;
    double sum=0;
    void checkdis(){
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
            System.out.print("it is a dissoriam number");
        }
        else{
            System.out.print("not an dissoriam number");
        }

    }

}
class b{
    int a[][],b,c,d[][];
    void arrAdd(){
        Scanner tv=new Scanner(System.in);
        System.out.println("number of rows u want in both the arrays");
        b=tv.nextInt();
        System.out.println("number of columns u want in both the array");
        c=tv.nextInt();
        a=new int[b][c];
        System.out.println("enter the input for the first array");
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                a[i][j]=tv.nextInt();
            }
        }
        System.out.println("enter the input for the second array");
        d=new int[b][c];
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                d[i][j]=tv.nextInt();
            }
        }
        System.out.println("added array");
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
class c{
    public static void main(String[] args) {
        // a ob=new a();
        // ob.arrInput();
        // b obj=new b();
        // obj.arrAdd();
        d ob=new d();
        ob.checkdis();
    }
}
