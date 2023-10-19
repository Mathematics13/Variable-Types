package java_homework;

/**Program 5
 * Calculator with addition,subtraction,multiplication and division methods
 * All methods with parameters
 * And Use string concatenation methods
 * Note: Two static and two instance methods
 */

public class Program5_calculator
{
    public static void main(String[] args)                                           //Main method declaration
    {
        System.out.println("Arithmetic Operations :  ");
        addition(78,97865);
        subtraction(5.765,56.987);                                          //Calling each method inside main method
        Program5_calculator pc5 = new Program5_calculator();
        pc5.multiplication(765,89.3456);
        pc5.division(456.8766f,25446.7887);
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
