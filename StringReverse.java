/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class StringReverse {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
//        for(int i = 0; i<str.length()/2;i++)
//        {
//            for(int j = str.length();j>=str.length()/2+1;j--)
//            {
//                if(i==j)
//                {
//                    System.out.println("palindrom");
//                }
//                else 
//                {
//                    System.out.println("not palindrom");
//                }
//            }
//        }
        String str1 = null;
        
        for(int i = str.length();i>=0;i--)
        {
            //str1 = (String) i;
           // System.out.println(str1);
           // System.out.println(str);
            str1 = str;
        }
        System.out.println(str1);
    }
    
}
