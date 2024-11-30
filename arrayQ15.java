import java.util.Scanner;

public class arrayQ15 {
    static void printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sum(int arr[][],int arr2[][],int arr3[][]){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
//        int arr[][]=new int[2][2];
//        int arr2[][]={{1,2},
//                      {3,4},
//                      {5,6}};
//        System.out.println(arr2[2][1]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size = ");
        int r=sc.nextInt();
        System.out.println("Enter column size = ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int arr3[][]=new int[r][c];
        System.out.println("Enter elements of first matrix = ");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix = ");
        for (int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered elements are = ");
        printarray(arr);
        System.out.println();
        printarray(arr2);
        System.out.println();
        sum(arr,arr2,arr3);
        printarray(arr3);
    }
}

