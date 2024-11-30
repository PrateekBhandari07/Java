import java.util.Scanner;

//transpose of an matrix
public class arrayQ17
{
    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int [][] findtanspose(int arr[][],int r1,int c1){
            int ans[][]=new int[c1][r1];
            for(int i=0;i<c1;i++){
                for (int j=0;j<r1;j++){
                    ans[i][j]=arr[j][i];
                }
            }
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size and column size of first matrix= ");
        int r1=sc.nextInt(),c1=sc.nextInt();
        System.out.println("Enter elements = ");
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans[][]=findtanspose(arr,r1,c1);
        printarray(ans);
    }
}
