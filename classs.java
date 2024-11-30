 class a{
    public int b(int v){
        return v*v;
    }
}
class dog{
    String name;
    public void bark(){
        System.out.println(name+ " is barking");
    }
}
public class classs
{
    public static void main(String[] args) {
        a object=new a();
       int result= object.b(5);
        System.out.println(result);

        dog tom=new dog();
        tom.name="rock";
        tom.bark();
    }
}
