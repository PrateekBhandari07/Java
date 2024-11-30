import java.util.Scanner;

public class ternary
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value for a");
        int a =sc.nextInt();
        System.out.println("enter value for b");
        int b =sc.nextInt();
        String result;
        result=(a>b)?"a is greatest of two numbers":"b is greatest of two numbers";
        System.out.println(result );

//        String max= (a%2==0)? fjf:vj ;
//        System.out.println(max);
    }
}
