class example{
    public static void main(String[] args) {
        int a[]=new int[1000];

        for (int i=1;i<=1000;i++){
            a[i-1]=i;
            System.out.println(a[i-1]);
        }

    }
}