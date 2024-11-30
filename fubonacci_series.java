import java.util.Scanner;

class fubonacci_series {

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }

    }
}