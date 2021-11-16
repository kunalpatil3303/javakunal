class person
{
    public void message()
    {
        System.out.println("this is a person class");
    }
}
class students extends person
{
    public void message()
    {
        System.out.println("this is a student class");
    }

    public void display()
    {
        message();
        super.message();
    }
}



public class work {
    public static void main(String[] args) {
        students obj = new students();
        obj.display();


    }
}
