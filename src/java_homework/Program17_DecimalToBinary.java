package java_homework;

import java.util.Scanner;

/**Program 17
 * Java Program to convert a decimal number to binary number
 */

public class Program17_DecimalToBinary
{
    public static void main(String[] args)             //Main method declaration
    {
        Scanner input = new  Scanner(System.in);      //Scanner class declaration
        System.out.println("Enter the number from the decimal number system with base 10  :  ");
        int x = input.nextInt();                      //Using nextInt() method
        input.close();
        String binary = Integer.toBinaryString(x);    //Converts to binary number system
        System.out.println(" Binary number of the given decimal number :  "+binary);
    }

}
