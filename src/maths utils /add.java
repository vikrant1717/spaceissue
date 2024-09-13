public class add {

    public void sum()
    {
        int a=10;
        int b=20;

        int c = a + b;

        System.out.println("value of c is :" + c); //added in second snaps
        

    }

    public void sub()
    {
        int a=100;
        int b=20;

        int c = a - b;

        System.out.println("value of c is :" + c); //commented in second snapshot 

    }

    public static void main(String[] args) {
        add obj = new add();
        obj.sum();
        obj.sub();
    }
}
