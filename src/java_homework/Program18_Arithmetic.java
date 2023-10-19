package java_homework;

/**Program 18
 * Java Program to print the sum(addition),subtract,multiply,divide and remainder of two numbers
 * Test Data given
 * To execute the expected output
 */

public class Program18_Arithmetic
{
    public static void main(String[] args)                   // Main method declaration
    {
      int a= 125;                                           //Local variables declaration
      int b=24;
      int add = a+b;                                       //Logic behind the code
      int sub= a-b;
      int mul = a*b;
      int div = a/b;
      int mod = a % b;                                 //Modulo operator leaves the remainder

        System.out.println("Sum of two numbers:  "+add);                       //Concatenation of two strings
        System.out.println("Difference between two numbers:  "+sub);
        System.out.println("Product of  two numbers:  "+mul);
        System.out.println("Division of  two numbers:  "+div);
        System.out.println("Modulo of  two numbers:  "+mod);
    }
}
