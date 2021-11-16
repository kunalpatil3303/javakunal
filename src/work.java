class test
{
    int a;
    int b;
    int add;

    test(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void display()
    {
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
     public void result()
     {
         add = int a + int b;
         System.out.println(add);
     }
}



public class work {
    public static void main(String[] args) {
        test obj = new test(10,20);
        obj.display();
        obj.result();
    }
}
