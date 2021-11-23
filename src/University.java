class student
{
    String name;

    public student(String name)
    {
        this.name=name;
    }
    public void display()
    {
        System.out.println("name of the student is " +name);
        System.out.println("----------------------------------");
    }
}
class professor extends student
{
    String professorname;

    public professor(String name,String professorname)
    {
        super(name);
        this.professorname=professorname;
    }
    public void display()
    {
        System.out.println("name of the student is " +name+ " and professor name is " +professorname);
        System.out.println("---------------------------------------------------------------------------");
    }
}
class marks extends student
{
    String score;

    public marks(String name,String score)
    {
        super(name);
        this.score=score;
    }
    public void display()
    {
        System.out.println("name of the student is " +name+ " and marks obtained are " +score);
    }
}



public class University {
    public static void main(String[] args) {
        student s1 = new student("Kunal Kishor Patil");
        s1.display();
        student s2 = new professor("Kunal","Tayyabali Sayyad");
        s2.display();
        student s3 = new marks("Kunal","20");
        s3.display();

    }
}
