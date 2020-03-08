interface printable
{
    void print();
}
interface showable
{
    void show();
}
public class ques4 implements printable,showable {
    public void print()
    {
        System.out.println("Hello");
    }

    public void show()
    {
        System.out.println("World");
    }
    public  static void main(String [] arg)
    {
        ques4 q = new ques4();
        q.print();
        q.show();
    }
}
