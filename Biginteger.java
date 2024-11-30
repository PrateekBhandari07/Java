import java.util.*;
import java.math.*;
public class Biginteger
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger b=new BigInteger("1");
        int n = sc.nextInt();
        if(n<0) System.out.println("facorial of negative number cant be found");
        else if(n==1|| n==0) System.out.println(1);
        else {
            for(int i=n;i>=2;i--){
                b=b.multiply(BigInteger.valueOf(i));
            }
            System.out.println(b);
        }


    }
}
