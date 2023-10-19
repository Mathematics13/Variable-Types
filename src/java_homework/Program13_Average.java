package java_homework;

import java.util.Scanner;

/**Program 13
 * Write a Java Program that takes three numbers to calculate and print the average of the numbers
 */

public class Program13_Average
{
    public static void main(String[] args)
    {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the first number :   ");
        double a = input.nextDouble();
        System.out.println("Enter the second number :   ");
        double b = input.nextDouble();
        System.out.println("Enter the third number :   ");
        double c = input.nextDouble();
        input.close();
        double avg = (a+b+c)/3;
        System.out.println("The average of given three numbers  :  " +avg);
    }
}
