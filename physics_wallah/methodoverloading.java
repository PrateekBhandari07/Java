package physics_wallah;

class Meth{
    public void print(int a){
        System.out.println("Age is : "+a);
    }
    public void print(String a){
        System.out.println("Name is : "+a);
    }
}

public class methodoverloading
{
    public static void main(String[] args) {

        Meth a=new Meth();
        a.print(12);
        a.print("prateek");

    }
}
