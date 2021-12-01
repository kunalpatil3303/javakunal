class students
{
    String name;

    public students(String name)
    {
        this.name=name;
    }
    public void display()
    {
        System.out.println("Name of student is " +name);
        System.out.println("--------------------------");
    }

}
class professors extends students
{

    String professername;

    public professors(String name,String professername)
    {
        super(name);
        this.professername=professername;
    }
    public void display()
    {
        System.out.println("Name of student is " + name+ " and Professor name is " +professername);
        System.out.println("---------------------------------------------------------------------");
    }
}
class assistantprofessor extends students
{

    String assistantprofessorname;

    public assistantprofessor(String name,String assistantprofessorname)
    {
        super(name);
        this.assistantprofessorname=assistantprofessorname;
    }
    public void display()
    {
        System.out.println("Name of student is " + name+ " and assistant professor name is " +assistantprofessorname);
    }
}


public class college {
    public static void main(String[] args) {
        students s1 = new students("KUNAL");
        s1.display();
        students s2 = new professors("KISHOR","TAYYABALI SAYYAD");
        s2.display();
        students s3 = new assistantprofessor("REWA","NILESH");
        s3.display();
    }
}
