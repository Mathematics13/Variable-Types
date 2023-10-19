package java_homework;

//Program1
/** Java Program to declare two instance variables
 * To declare one instance method
 * Call both instance variables into the instance method  inside the print statement
 * Declare the main method
 * Call the above instance method into the Main method and Run the program
 */
public class Program1
{
    int dob=13122000;                             // Instance Or Global variables declaration and initialization
    String place = "Edinburgh";

   public static void main(String[] args)        //Main method
   {
       Program1 p2 = new Program1();
       p2.details();                            //Calling the instance method inside the main method

   }

   void details()                               // Instance or non-static method
   {
       Program1 p1 = new Program1();
       System.out.println(p1.dob);             //Calling both instance variables into the instance method inside the print statement
       System.out.println(p1.place);
   }

}
