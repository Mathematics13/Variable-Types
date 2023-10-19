package java_homework;

import java.util.Scanner;

/**Program16
 * Java Program to add two binary numbers
 * Given Input
 * Execute the Output
 */
public class Program16_AddBinaryNumbers
{
    public static void main(String[] args)
    {                                                               //Scanner class declaration
        Scanner sc = new Scanner(System.in);                       //Scanner class predefined class in Java ,imports java.util.Scanner
        System.out.println("Enter the first binary number :  ");  //Allows user to type in the input
        String a = sc.next();                                    //Using the scanner method next();
        System.out.println("Enter the second binary number :  ");
        String b = sc.next();
        sc.close();                                            //Always good practice to close the scanner class to avoid leakage
        int number1 = Integer.parseInt(a,2);            //String value is converted to Integer using parseInt method
        int number2 = Integer.parseInt(b,2);           //radix is the parameter that take the number system value ,binary number system base is 2
        int number3 = number1+number2;
        System.out.println("number1 :  " +Integer.toBinaryString(number1));
        System.out.println("number2 :  " +Integer.toBinaryString(number2));
        System.out.println("Sum of two binary numbers :  " +Integer.toBinaryString(number3));

    }

}
