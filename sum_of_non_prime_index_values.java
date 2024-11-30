//Calculate sum of non-prime index values in an array:

import java.util.Scanner;

public class sum_of_non_prime_index_values
{
    public static boolean isPrime(int n){
        if(n<=1){
//            System.out.println(n);

            return false;
        }
        else {
            for(int i=2;i<n;i++){
                if(n%i==0){
//                    System.out.println(i);

                    return false;

                }
            }
            return true;
        }
    }
    public static int sum(int array[]){
        int sum=0;
        int i=array.length-1;
        System.out.println(i);
        while(i>=0){
            if(!isPrime(i)){
                sum+=array[i];
                System.out.println(array[i]);

            }
            i--;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("How many elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int result=sum(array);
        System.out.println("sum of non-prime index values in an array : "+result);

    }
}
