import java.util.Scanner;

//Matrix multiplication
public class arrayQ16
{
    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void input(int arr[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void multiply(int arr[][],int r1,int c1,int arr2[][],int r2,int c2){
        if (c1!=r2){
            System.out.println("Multiplication of matrix is not possible");
            return;
        }
        int arr3[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    arr3[i][j]+=(arr[i][k] * arr2[k][j]);
                }
            }
        }
        printarray(arr3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size and column size of first matrix= ");
        int r1=sc.nextInt(),c1=sc.nextInt();
        System.out.println("Enter column and row size of second matrix = ");
        int r2=sc.nextInt(),c2=sc.nextInt();
        int arr[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        System.out.println("Enter elements of first matrix = ");
        input(arr);
        System.out.println("Enter elements of second matrix = ");
        input(arr2);
        System.out.println("");
        printarray(arr);
        System.out.println("");
        printarray(arr2);
        System.out.println("");
        multiply(arr,r1,c1,arr2,r2,c2);
    }
}
