import java.util.Scanner;

public class multiplication_of_matrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of first matrix");
        int f1=sc.nextInt();
        System.out.println("Enter the column size of first matrix");
        int f2=sc.nextInt();
        System.out.println("Enter the row size of second matrix");
        int s1=sc.nextInt();
        System.out.println("Enter the column size of second matrix");
        int s2=sc.nextInt();
        int a[][]=new int[f1][f2];
        int b[][]=new int[s1][s2];
        int c[][]=new int[f1][s2];

        System.out.println("Enter the elements for first matrix");
        for(int i=0;i<a.length; i++){
            for(int j=0;j<f2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for second matrix");

        for(int i=0;i<b.length; i++){
            for(int j=0;j<s2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("First matrix elements");
        for(int i=0;i<a.length; i++){
            for(int j=0;j<f2;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("Second matrix elements");
        for(int i=0;i<b.length; i++){
            for(int j=0;j<s2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
//        System.out.println("Addition of Matrix : ");
//        for(int i=0;i<c.length; i++) {
//            for (int j = 0; j < s2; j++) {
//                System.out.print(a[i][j]+b[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();

//       code for the multiplication of matrix
//multiplying and printing multiplication of 2 matrices
        System.out.println("multiplication of matrix");
        for(int i=0;i<f1;i++){
            for(int j=0;j<s2;j++){
               // c[i][j]=0;
                for(int k=0;k<c.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }

    }

}
