package java_homework;

/**Program 12
 * Java Program to compute the specified expressions
 * And print the Output
 */
public class Program12_Expressions
{
    public static void main(String[] args)           //Main method declaration
    {
       double d = 40.5;                             //Declaration and initialization of Local variables
       float f = 3.5f;
       double e = 25.5;
       float h = 4.5f;
       double result = ((e*f-f*f)/(d-h));          //Storing the result of the specified expressions
       System.out.println(result);                //Printing the Output
    }

}
