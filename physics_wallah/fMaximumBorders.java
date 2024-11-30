package physics_wallah;
import java.util.Scanner;
//You are given a table with n rows and m
// columns. Each cell is colored with white or black.
// Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of
// consecutive black cells in any row or column without any white cell in between.
//A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

//The first line contains t
// denoting the number of test cases.
//The first line of each test case contains integers n,m
// denoting the number of rows and columns of the matrix.
// 5Here, '#' represents a black cell and '.' represents a white cell.
//Each of the next  n lines contains  m integers.
public class fMaximumBorders {
    public static void main(String[] args)  {

        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
        while(t>0){
            t--;
            int m=sc.nextInt();
            int n=sc.nextInt();
            char arr[][]=new char[m][n];
            int count=0,check=0;

            System.out.println("Enter ");
            for(int i=0;i<m;i++){
                String  lines = sc.next();
                for(int j=0;j<n;j++){
                    arr[i][j] = lines.charAt(j);
                }
            }
           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   if(arr[i][j]=='.'){
                       if(check<count){
                           check=count;
                       }
                       count=0;
                   }
                   if(arr[i][j]=='#'){
                       count++;
                   }
                   if(j==n-1){
                       if(check<count){
                           check=count;
                       }
                       count=0;
                   }
               }
           }
           System.out.println(check);
       }
    }
}
