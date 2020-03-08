import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques7 {
    public static void main(String[] args) throws IOException {
        float length,breadth,height;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------For Box 1 ------------");
        System.out.println("Enter Length:");
        length =Float.parseFloat(stdin.readLine());
        System.out.println("Enter Breadth:");
        breadth = Float.parseFloat(stdin.readLine());
        System.out.println("Enter Height:");
        height = Float.parseFloat(stdin.readLine());
        Box b1 = new Box();
        System.out.println("Volume:" + b1.volume(length,breadth,height));

        System.out.println("------------For Box 2 ------------");
        System.out.println("Enter Length:");
        length =Float.parseFloat(stdin.readLine());
        System.out.println("Enter Breadth:");
        breadth = Float.parseFloat(stdin.readLine());
        System.out.println("Enter Height:");
        height = Float.parseFloat(stdin.readLine());
        Box b2 = new Box();
        System.out.println("Volume:" + b2.volume(length,breadth,height));
    }
}
class Box
{
    public float volume(float l,float b, float h)
    {
        return (l*b*h);
    }
}