import java.util.Scanner;

public class fFindDivisiors
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt();
//        for(int i=l;i<r;i++){
//            if(i%k==0){
//                l=i;
//                break;
//            }
//        }
//        System.out.println(l);
//        for(int i=r;i>l;i--){
//            if(i%k==0){
//                r=i;
//                break;
//            }
//        }
//        System.out.println(r);
//        int result=((r-l)+k)/k;
//        System.out.println(result);
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
