import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Fruit Name:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String name = stdin.readLine();
        System.out.println("Enter Type of Fruit:");
        String type = stdin.readLine();
        fruit f1 = new fruit(name,type);
        System.out.println("Enter Another Fruit name :");
        String name1 = stdin.readLine();
        System.out.println("Enter Its Type:");
        String type1 = stdin.readLine();
        fruit f2 = new fruit(name1,type1);
        f1.display();
        f2.display();
    }
}
class fruit
{
    String name;
    String type;
    fruit(String n,String t)
    {
        name = n;
        type = t;
    }
    void display()
    {
        System.out.println("Name of Fruit is " + name + " and Type is " + type);
    }
}