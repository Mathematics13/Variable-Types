package java_homework;

import java.util.Scanner;

/**Program 9
 * Write a program to convert the Upper case to Lower case
 */
public class Program9_UpperCaseToLowerCase
{
    public static void main(String[] args)                                         //Main method declaration
    {
        Scanner s1 = new Scanner(System.in);                                     //Scanner Declaration
        System.out.println("Enter any word or a sentence in the Upper Case");   //User Input
        String a= s1.nextLine();                                               //next() method in string is for only one word
        s1.close();                                                           //nextLine() method is for whole line
        String b = a.toLowerCase();                                          //convertion from Upper case to Lower case
        System.out.println("The Lower case of the given String :  " +b);    //Concatenation
    }

}
