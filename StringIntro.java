/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class StringIntro {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        
        int compare = A.compareTo(B);
        if(compare > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
      
    }
    
}
