package java_homework;

/**Program 3
 * Declare one instance and one static variable
 * Declare one instance method
 * Declare one static method
 * Call both instance and static variables into both instance and static methods inside the print statement
 * Declare the Main method
 * Call both instance and static methods into the Main method and run the program
 */
public class Program3
{
    double price = 89754.231;                        //Declaring  and initializing one instance variable
    static boolean female = true;                   //Declaring and initializing  one static variable
    public static void main(String[] args)         //Declaring the Main method
    {
        cost();                                   //Calling both instance and static methods into the Main method and run the program
        Program3 p2=new Program3();
        p2.sale();
    }
     void sale()                                  //Declaring one instance method
     {
         System.out.println(female);              //Static variable just call by its name
         Program3 p3= new Program3();            //Creating an object with the help of reference variable
         System.out.println(p3.price);          //Calling both instance and static variables into instance method inside the print statement
     }
    static void cost()                           //Declaring one static method
    {
        System.out.println(female);
        Program3 p4= new Program3();           //Creating an object with the help of reference variable
        System.out.println(p4.price);          //Call both instance and static variables into  static methods inside the print statement
    }
}
