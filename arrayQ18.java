import java.util.Scanner;

public class arrayQ18
//    Transpose of the matrix using inplace method
{
    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

            }
        }
        printarray(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column of matrix : ");
        int r=sc.nextInt(),c=sc.nextInt();
        int arr[][] =new int[r][c];
        System.out.println("Enter elements for first matrix : ");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr,r,c);
    }
}
