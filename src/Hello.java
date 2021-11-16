class calculate
{
    String id;
    String name;
     calculate()
    {

    }
     calculate(String i , String n)
    {
        id = i;
        name = n;

    }

}
public class Hello {
    public static void main(String[] args) {
        calculate obj = new calculate();
        System.out.println("this is default constructor");
        System.out.println("ID: " + obj.id  +  "Name: " + obj.name );

        calculate object = new calculate("10","david");
        System.out.println("this is parameterized constructor");
        System.out.println("ID: " + object.id  +  "Name: " + object.name );



    }
}
