/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerrankPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class StackBalance {
    
     public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      List lt = new ArrayList();
      while (sc.hasNext()) {
         String str=sc.next();
            //Complete the code
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)=='{' || str.charAt(i)=='(')
             {
                 lt.add(i, lt);
             }
             
             if(str.charAt(i)=='}' || str.charAt(i)==')')
             {
                 if(str.charAt(i-1)==str.charAt(i))
                 {
                     lt.remove(i-1);
                 }
             }
         }
         if(lt==null)
         {
            System.out.println("true");
         }
          
      }
      
     
   }
}
