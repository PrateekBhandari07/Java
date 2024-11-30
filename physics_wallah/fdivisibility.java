package physics_wallah;
//You are provided an array A of size N
// that contains non-negative integers. Your task is to determine whether the number that is formed by
// selecting the last digit of all the N numbers is divisible by 10

import java.util.Scanner;
public class fdivisibility
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        if(A[N-1]%10==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
