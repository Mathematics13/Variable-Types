package java_homework;

/** Program15
 * Java Program to swap two variables
 */

public class Program15_SwapVariables
{
    public static void main(String[] args)         //Main method declarartion
    {
     String x = "Ram";                            //If x=y means y value is assigned to x so the output will be Laxman for both
     String y = "Laxman";                        //Local variables declared and initialized inside the main method
       String temp;                             //Temporary variable declaration for swapping
        temp=x;
        x=y;
        y=temp;                               //With the help of third variable temp,swapping is attained

     System.out.println("x : " +x);
     System.out.println("y : " +y);
    }
}
