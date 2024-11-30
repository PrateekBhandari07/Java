import java.util.Scanner;
//
//public class String1
//{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        System.out.println(a);
//        char first,last;
//        int length=a.length();
//            first=a.charAt(0);
//            int ondu=first;
//
//            last=a.charAt(length-1);
//            int eradu=last;
//        System.out.println(first+" "+last);
//        System.out.println(ondu+" "+eradu);
//
//
//    }
//}

import java.util.HashSet;

public class String1 {
    public static int findFirstRepeatedFromTail(int[] arr, int n) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            if (num > 0 && !set.contains(num)) {
                set.add(num);
            } else if (num > 0 && set.contains(num)) {
                result = num;
                break;
            }
        }

        if (result == 0) {
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > 0) {
                    result = arr[i];
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 4, 4, 9, 8,10};
        int input2 = 7;
        int result = findFirstRepeatedFromTail(input1, input2);
        System.out.println("The first repeated number from the tail is: " + result);
    }
}


