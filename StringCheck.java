/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//why we can not define function in main method?
//how to convert string in to an array?
package vecationprectice;

import java.util.Scanner;
//import java.lang.String;

/**
 *
 * @author Nikhil
 */
public class StringCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string here : ");
        String str = sc.nextLine();
        String str1 = sc.nextLine();
//        loop method for finding a string
//        int i;
//        for( i = 0; i<=str.length();i++)
//        {
//            
//        }
//        System.out.println("The length of string is: "+i);
//   
        System.out.println("length of string is : "+str.length());
        System.out.println("position of character at: " + str.charAt(4));
        //str.getChars(i, k, h, m);
        
        if(str.equals(str1))
        {
            System.out.println("strings are matched");
        }
        else
        {
            System.out.println("string are not matched");
        }
        
        System.out.println("check wether two string equles or different: "+str.compareTo(str1));
        
         System.out.println("Convert to uppercase: "+str.toUpperCase());
         
         //To check wether string is palindrom or not
         
         int p = 10;
         System.out.println("convert to string"+String.valueOf(p));
         
         int i,j;
         for(i = 0; i<=str.length()/2; i++)
         {
             for(j=str.length() ; j<=str.length()/2+1;j--)
             {
                 if(i == j)
                 {
                     System.out.println("palindrom");
                 }
                 
             }
         }
    }
}
