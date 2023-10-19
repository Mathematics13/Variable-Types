package java_homework;

/** Program14
 * Java program to print the area a
 * And Perimeter of a rectangle
 * Given Test Data
 * Expected Output mentioned
 */
public class Program14_Rectangle
{
    public static void main(String[] args)                         //Main method declaration
    {
        float width = 5.5f;                                        //Local variables declaration and initialization
        float height = 8.5f;
        double area = width * height;                             //Area of the Rectangle logic
        double perimeter = 2*(width+height);                     //Perimeter of the Rectangle logic

        System.out.println("Area of the Rectangle :  " +area);
        System.out.println("Perimeter of the Rectangle :  " +perimeter);
    }
}
