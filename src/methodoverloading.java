class casio
{
    int num1;
    int result;

    public casio(int num1)
    {
        result=num1;
    }
    public void display()
    {
        System.out.println(result);
    }
}
class casios
{
    int num1;
    int num2;
    int result2;

    public casios(int num1,int num2)
    {
        result2=num1+num2;
    }
    public void display()
    {
        System.out.println(result2);
    }
}


public class methodoverloading {
    public static void main(String[] args) {
        casio s1 = new casio(10);
        s1.display();
        casios s2 = new casios(10,20);
        s2.display();

    }
}
