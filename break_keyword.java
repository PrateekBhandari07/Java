import java.util.Scanner;
//printing  the numbers which are multiple of 5 and 7

//finding first multiple of 5 and 7
public class break_keyword {
    public static void main(String[] args) {
//        System.out.println("Enter the last number that you want to print");
//        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        for(int i=1;i<=num;i++){
//            if(i%5==0 && i%7==0){
//                System.out.println(i);
//            }
//            if (i == 500) {
//                break;
//
//            }
//        }
        int i = 1;
        while (true) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
                break;
            }
//            if (i == 500) {
//                break;
//            }
            i++;
        }
    }}
