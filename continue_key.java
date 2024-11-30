//print numbers between 1 to 50 except the multiple of 3
public class continue_key {
    public static void main(String[] args) {
        int num=1;
        for (num=1;num<51;num++){
            if(num%3==0){
                continue;
            }

                System.out.println(num);

        }
//        for(int i=1;i<=5;i++){
//            System.out.print(i+",");
  //      }
    }
}
