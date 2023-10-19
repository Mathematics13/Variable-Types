package java_homework;

import java.util.Scanner;

/**Program 5 Using Scanner Class
 * Calculator with addition,subtraction,multiplication and division methods
 * All methods with parameters
 * And Use string concatenation methods
 * Note: Two static and two instance methods
 */
public class Program5_ScannerClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :    ");
        double a = input.nextDouble();
        System.out.println("Enter the second number :    ");
        double b = input.nextDouble();
        input.close();
        addition(78,97865);
        subtraction(5.765,56.987);
        Program5_ScannerClass psc = new Program5_ScannerClass();
        psc.multiplication(8765,654675.866);
        psc.division(657.23f,5778.7868);
    }
    static void addition(int a,int b)                                      // Two static  methods with two parameters each
    {
        int add = a+b;
        System.out.println("Addition of two numbers :   " +add);
    }
    static void subtraction(double c,double d)
    {
        double sub = c-d;
        System.out.println("Subtraction of two numbers :   " +sub);
    }
    void multiplication(int e,double f)                               // Two instance methods that is non-static methods
    {
        double mul = e*f;
        System.out.println("Multiplication of two numbers :   " +mul);
    }
    void division(float i,double j)
    {
        double div = i/j;
        System.out.println("Division of two numbers :   " +div);
    }
}
