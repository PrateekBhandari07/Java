//


import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        System.out.println("Enter value for Row  and Column = ");
        Scanner in = new Scanner(System.in);
        int r=in.nextInt(), c=in.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(i+","+j+ " ");
            }
            System.out.println();
        }
    }
}
