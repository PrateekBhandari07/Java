//Find sum of prime number except the largest prime number

import java.util.Scanner;

public class sum_of_prime_numbers
{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }

        }
        return true;

    }
    public static int findSum(int array[]){
        int sum=0;
        int max=0;

        for(int i=0;i<array.length;i++){
            if(isPrime(array[i])){
                if(array[i]>max){
                    max=array[i];
                }
                sum+=array[i];
            }
        }
        return sum-max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers : ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int sum=findSum(array);
        System.out.println(sum);

    }
}
