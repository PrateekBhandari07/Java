
class hello extends helo{

      public int multiply(int a,int b){
          return a*b;
      }



}
public class inheritance
{
    public static void main(String[] args) {
//        helo a=new helo();
//        System.out.println(a.add(4,5));
        hello b=new hello();
        System.out.println(b.multiply(3,4));

    }
}
