package java_homework;

import java.util.Scanner;

/**Program 8
 * Write a program to calculate the area of a triangle
 */
public class Program8_Triangle
{
    public static void main(String[] args)                               //Main method declaration
    {
        Scanner sr = new  Scanner(System.in);                           //Scanner declaration
        System.out.println("Enter the base of the triangle :   ");
        float b = sr.nextFloat();                                      //User providing input for the system to execute
        System.out.println("Enter the height of the triangle :  ");
        float h = sr.nextFloat();
        sr.close();
        double a = (0.5)*b*h;                                         //Area of a triangle is  1/2 *b*h
        System.out.println("Area of a triangle :  "+a);              //Concatenation
    }
}
