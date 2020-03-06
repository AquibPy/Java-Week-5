import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ques2 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("What Type of Account You have?");
        System.out.println("\n1.Saving Account \n2.Current Account");
        System.out.println("Enter Your Choice !!!!");
        choice = Integer.parseInt(stdin.readLine());

        if (choice == 1)
        {
            Sav_acct s = new Sav_acct();
            System.out.println("\n1.Deposit Money \n2.Withdraw Money \n3.Compound Interest\n4.Display Details");
            int d = Integer.parseInt(stdin.readLine());
            if (d == 1)
            {
                System.out.println("Enter Amount to Deposit:");
                float dep = Float.parseFloat(stdin.readLine());
                s.deposit(dep);
                s.display();
            }
            else if (d == 2) {
                System.out.println("Enter Amount to Withdraw:");
                float with = Float.parseFloat(stdin.readLine());
                s.withdraw(with);
                s.display();
            }
            else if (d == 3)
            {
                s.compoundInterest();
            }
            else if (d== 4)
            {
                System.out.println("Details of a Customer is");
                s.display();
            }
            else {
                System.out.println("Invalid Choice !!!!");
                }
            }
        else if (choice == 2) {
            Curr_acct c = new Curr_acct();
            System.out.println("\n1.Deposit Money \n2.Withdraw Money \n3.Display Details");
            int d = Integer.parseInt(stdin.readLine());
            if (d == 1)
            {
                System.out.println("Enter Amount to be Deposit:");
                float dep = Float.parseFloat(stdin.readLine());
                c.deposit(dep);
                c.display();
            }
            else if (d == 2)
            {
                System.out.println("Enter Amount to Withdraw:");
                float with = Float.parseFloat(stdin.readLine());
                c.withdraw(with);
                c.display();
            }
            else if (d == 3)
            {
                System.out.println("Details of a Customer is");
                c.display();
            }
            else {
                System.out.println("Invalid Choice !!!!");
            }
        }
    }
    }

class Account
{
    String c_name;
    long acc_num;
    String type;
    Account() throws IOException {
        System.out.println("Enter Customer Name:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        c_name = stdin.readLine();
        System.out.println("Enter Account Number:");
        acc_num = Long.parseLong(stdin.readLine());
        System.out.println("Enter Type of Account:");
        type = stdin.readLine();
    }
}

class Curr_acct extends Account
{
    float bal;
    static int min_bal = 3000;
    Curr_acct() throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Balance:");
        bal = Float.parseFloat(stdin.readLine());
    }
    void deposit(float amount)
    {

        System.out.println("Amount Deposit Successfully!!!! ");
        System.out.println("Total Balance:"+(bal +=amount));
    }
    float withdraw(float amount)
    {
        if (bal<amount)
        {
            System.out.println("Insufficient Balance !!!");
        }
        else {
            if(bal<min_bal)
            {
                float penalty = (bal*5)/100;
                bal -=penalty;
                System.out.println("Penalty of Rs." + penalty);
            }
            System.out.println("Amount Withdraw Successfully!!!");
            System.out.println("Total Balance:" + (bal -=amount));
        }

        return bal;
    }
    void display()
    {
        System.out.println("\nName: "+ c_name +"\nAccount Number: " + acc_num + "\nBalance: " + bal);
    }
}

class Sav_acct extends Account
{
    float bal;
    Sav_acct() throws IOException {
        System.out.println("Enter Balance:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        bal = Float.parseFloat(stdin.readLine());
    }
    void compoundInterest() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Rate:");
        float rate = Float.parseFloat(stdin.readLine());
        System.out.println("Enter Time Period:");
        float time = Float.parseFloat(stdin.readLine());
        float CI = (float) (bal*Math.pow((1+rate/1),1*time));
        System.out.println("Compound Interest is " + CI);
    }
    float withdraw(float amount)
    {
        if (amount > bal)
        {
            System.out.println("Insufficient Balance !!!!");
        }
        else
        {
            System.out.println("Amount Withdraw Successfully!!!");
            System.out.println("Total Balance:" + (bal -=amount));
        }
        return bal;
    }
    void deposit(float amount)
    {
        System.out.println("Amount Deposit Successfully!!!! ");
        System.out.println("Total Balance:"+(bal +=amount));
    }
    void display()
    {
        System.out.println("\nName: "+ c_name +"\nAccount Number: " + acc_num + "\nBalance: " + bal);
    }
}