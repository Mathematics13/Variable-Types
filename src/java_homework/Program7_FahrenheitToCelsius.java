package java_homework;

import java.util.Scanner;

/** Program 7
 * Program to insert any temperature value in degree Fahrenheit
 * And Convert to degree Celsius
 */
public class Program7_FahrenheitToCelsius
{
    public static void main(String[] args)                                                    //Main method declaration
    {
        Scanner scan = new Scanner(System.in);                                              //Scanner class declaration
        System.out.println("Enter any temperature value in degree Fahrenheit :   ");
        float F= scan.nextFloat();
        scan.close();
        double con = ((F-32)*5/9);                                                       //Logic formula
        System.out.println("The required Celsius for the entered fahrenheit :  " +con); //String concatenation

    }

}
