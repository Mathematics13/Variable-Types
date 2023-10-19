package java_homework;

import java.util.Scanner;

/**Program 10
 * Write a Java Program that takes a number as input and prints its multiplication table up to 10
 */

public class Program10_TableUpto10
{
    public static void main(String[] args)                            //Main method declaration
    {
        Scanner input = new Scanner(System.in);                     //Scanner declaration
        System.out.println("Enter any number :   ");               //User input
        int a= input.nextInt();
        input.close();                                          //scanner close
        int a1 = a*1;                                          //Logic
        int a2 = a*2;
        int a3 = a*3;
        int a4 = a*4;
        int a5 = a*5;
        int a6 = a*6;
        int a7 = a*7;
        int a8 = a*8;
        int a9 = a*9;
        int a10 = a*10;
        System.out.println(a +"*1 " +"= "  +a1);          //Print statements
        System.out.println(a +"*2 " +"= "  +a2);
        System.out.println(a +"*3 " +"= "  +a3);
        System.out.println(a +"*4 " +"= "  +a4);
        System.out.println(a +"*5 " +"= "  +a5);
        System.out.println(a +"*6 " +"= "  +a6);
        System.out.println(a +"*7 " +"= "  +a7);
        System.out.println(a +"*8 " +"= "  +a8);
        System.out.println(a +"*9 " +"= "  +a9);
        System.out.println(a +"*10 " +"= " +a10);
    }
}
