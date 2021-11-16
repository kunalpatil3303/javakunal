import jdk.swing.interop.SwingInterOpUtils;

class student
{
    String id;
    String name;

    student()
    {

    }

    student(String i , String n)
    {
        id = i;
        name = n;
    }
}

public class world {
    public static void main(String[] args) {
        student obj = new student();
        System.out.println("this is default constructor");
        System.out.println("ID:" + obj.id);
        System.out.println("Nmae: " + obj.name);

        student student = new student("10","David");
        System.out.println("this is parameterized constructor");
        System.out.println("ID: " + student.id);
        System.out.println("Name: "+  student.name);

    }
}
