class athelete
{
    String name;

    public athelete(String name)
    {
        this.name=name;
    }
     public void display()
     {
         System.out.println("name of the athelete is " +name);
     }

}
class event extends athelete
{
    String name;
    String competition;

    public event(String name,String competition)
    {
        super(name);
        this.competition=competition;
    }
    public void display()
    {
        System.out.println("name of the athelete is " +name+ " and event participated is " +competition);
    }
}
class football extends athelete
{
    String name;
    String goals;

    public football(String name,String goals)
    {
        super(name);
        this.goals=goals;
    }
    public void display()
    {
        System.out.println("name of the athelete is " +name+ " and goals made are " +goals);
    }
}



public class sports {
    public static void main(String[] args) {
        athelete s1 = new athelete("KUNAL KISHOR PATIL");
        s1.display();
        athelete s2 = new event("KUNAL KISHOR PATIL","RUNNING 100m");
        s2.display();
        athelete s3 = new football("KUNAL KISHOR PATIL","1");
        s3.display();

    }
}
