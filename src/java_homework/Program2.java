package java_homework;

/**Program 2
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement
 * Declare the Main method
 * Call the static method into the Main method and run the program
 */

public class Program2
{
    static float percentage = 99.99f;              //Declaring and initializing  two static variables
    static String location = "London";
    public static void main(String[] args)         //Main method declaration
    {
        calculation();
    }
    static void calculation()                     //Declaring one static method
    {
        System.out.println(percentage);          //Calling both static variables into the static method inside the print statement
        System.out.println(location);            //Calling just by its name directly
    }


}
