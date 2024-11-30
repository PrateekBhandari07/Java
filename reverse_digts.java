import java.util.Scanner;

public class reverse_digts {
    public static void main(String[] args) {
        System.out.println("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while (num>0){
            count=(count*10)+num%10;;
            num=num/10;
        }
        System.out.println(count);
    }
}
