import java.util.Scanner;
class arri{
    void first( int[] arr) {

        int ary[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            //System.out.println("arraayy = "+arr[i]);
            if(arr[i]>0){
                ary[i]=arr[i];
            }

        }
        System.out.println();

      for(int i=0;i<arr.length;i++){
          if(ary[i]==0){
              continue;
          }
          else {
              System.out.println(ary[i]);
          }
      }

    }
}

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length");
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        arri o=new arri();
        o.first(arr);

    }
}
