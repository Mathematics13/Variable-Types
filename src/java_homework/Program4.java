package java_homework;

/**Program 4
 * Declare two instance and two static variables
 * Declare one instance method
 * Declare one static method
 * Call all four instance and static variables into both instance and static methods inside the print statement
 * Declare the Main method
 * Call both instance and static methods into the Main method and run the program
 */
public class Program4
{
    byte mini = -127;                          //Declaring and Initializing two instance variables
    short micro =1000;
    static char initial = 'X';                //Declaring and Initializing two static variables
    static String animal = "Lion";
    public static void main(String[] args)
    {
        domestic();                         //Calling both instance and static methods into the Main method and run the program
        Program4 prog2= new Program4();
        prog2.wild();
    }

    void wild()                             //Declaring one instance method
    {
        System.out.println(initial);        //Calling all four instance and static variables into instance  method inside the print statement
        System.out.println(animal);
        Program4 prog = new Program4();
        System.out.println(prog.mini);
        System.out.println(prog.micro);
    }
    static void domestic()                  //Declaring one static method
    {
        System.out.println(initial);       //Calling  all four instance and static variables into static methods inside the print statement
        System.out.println(animal);
        Program4 prog1 = new Program4();
        System.out.println(prog1.mini);
        System.out.println(prog1.micro);
    }

}
