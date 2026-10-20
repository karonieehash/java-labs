
import java.util.Scanner;

class a{
    void addArray(int a[][],int b[][], int d, int c){
        for(int i=0;i<d;i++){
            for(int j=0;j<c;j++){
                System.out.print(b[i][j]+a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
class ar{
    public static void main(String[] args) {
        Scanner tv=new Scanner(System.in);
        System.out.println("number of rows u want in both the arrays");
        int b=tv.nextInt();
        System.out.println("number of columns u want in both the array");
        int c=tv.nextInt();
        int a[][]=new int[b][c];
        System.out.println("enter the input for the first array");
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                a[i][j]=tv.nextInt();
            }
        }
        System.out.println("enter the input for the second array");
        int d[][]=new int[b][c];
        for(int i=0;i<b;i++){
            for(int j=0;j<c;j++){
                d[i][j]=tv.nextInt();
            }
        }
        a ob=new a();
        ob.addArray(a, d, b, c);
    }
}