import Arithmetic.add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques6 {
    public static void main(String[] args) throws IOException {
        add a = new add();
        int choice;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number:");
        double aa = Double.parseDouble(stdin.readLine());
        System.out.println("Enter Second Number:");
        Double b = Double.parseDouble(stdin.readLine());
        System.out.println("Please Choose the Arithmetic Operation !!!!");
        System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus");
        choice = Integer.parseInt(stdin.readLine());
        if (choice == 1)
        {
            System.out.println("Addition:" + a.addition(aa,b));
        }
        else if (choice == 2)
        {
            System.out.println("Subtraction:" + a.subtraction(aa,b));
        }
        else if (choice == 3)
        {
            System.out.println("Multiplication:" + a.multiplication(aa,b));
        }
        else if (choice == 4)
        {
                System.out.println("Division:" + a.division(aa,b));
        }
        else if (choice == 5)
        {
            System.out.println("Modulus:"  + a.modulus(aa,b));
        }
        else {
            System.out.println("Invalid Choice !!!");
        }
    }
}
