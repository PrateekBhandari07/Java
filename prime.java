import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.print(" check wheather the entered number is prime or wot = ");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        if(isPrime(a)){
            System.out.println("Prime number");
        }
        else {
            System.out.println("It is not a prime number ");
        }
    }
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        else {
            for (int i=2;i<number/2;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
    }

}
