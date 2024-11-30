package physics_wallah;



public class constructor
{
    public static void main(String[] args)
    {
        Addition ob=new Addition(5,6);
        int result= ob.add();
        System.out.println(result);

    }
}

class Addition{
    int first,second;
    public  Addition(int a,int b){
         first=a;
         second=b;

    }
    public int add()
    {
        return first+second;
    }
}