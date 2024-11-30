import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        System.out.println("Enter  values for Row = ");
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter  values for Column = ");
        int c = sc.nextInt();
        for(int  i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0||i==r-1||j==c-1){
                    System.out.print("* ");
                }
                else {
                    System.out .print("  ");
                }
            }                System.out.println();

        }

    }
}
