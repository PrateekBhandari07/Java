import java.util.Scanner;
public class Pattern_3 {
    public static void main(String[] args) {
        System.out.println("Enter  values for Row = ");
        Scanner sc =new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=0;i<r;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
