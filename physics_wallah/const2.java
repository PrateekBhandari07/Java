package physics_wallah;

public class const2
{
    public static void main(String[] args) {
        Complex num1=new Complex(2,4);
        Complex num2=new Complex(4,1);
        num1.print();
        num2.print();
        System.out.println("adding two numbers ");
        Complex result=num1.add(num2);
        System.out.println(result);
        result.print();

    }
}
class Complex{
    int a,b;
    public Complex(int real){
        a=real;
        b=12;
    }

    public Complex(int real,int imaginary){

        a=real;
        b=imaginary;
    }
    public void print(){
        System.out.println(a+" + "+b+"i");
    }
    public Complex add(Complex num2){
         Complex newNum=new Complex(a+ num2.a,b+ num2.b);
        return newNum;
    }
}
