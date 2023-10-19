package java_homework;

import java.util.Scanner;

/** Program 6
 * Write  a Program to enter any radius value of the circle and find out the area
 */

public class Program6_Circle
{
    public static void main(String[] args)                            //Main method declaration
    {
        Scanner input = new  Scanner(System.in);                     //Scanner class declaration
        System.out.println("Enter the radius of the circle :  ");
        double r = input.nextDouble();                              //Entering the radius using nextDouble() method
        input.close();                                             //Close the scanner class always to avoid leakage
        float pi = 3.14f;                                         //Local variable declaration
        double area = pi*r*r;                                    //Logic
        System.out.println(area);                               //Print statement

    }

}
