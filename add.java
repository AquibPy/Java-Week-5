package Arithmetic;

public class add {
    double a,b;
    public double addition(double a, double b)
    {
        return (a+b);
    }
    public double subtraction(double a, double b)
    {
        return  (a-b);
    }
    public double multiplication(double a,double b)
    {
        return (a*b);
    }
    public double division(double a, double b)
    {
        try {
            double div = a/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("You should not divide a number by zero");
        }
        return (a/b);
    }
    public  double modulus(double a,double b)
    {
        return a%b;
    }
}
