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
public class EvenCheck {

  
   
   Scanner sc = new Scanner(System.in);
   
   int n = sc.nextInt();
   
   public int check()
   {
       for(int i = 0; i<=n ; i++)
       {
           if(i % 2 == 0)
           {
               System.out.println(i);
               //When do we use return statement
               //eg return i;
           }
           
          
       }
       return 0;
   }
   
    public static void main(String args[])
    {
         System.out.println("Enter your number");
        EvenCheck ob = new EvenCheck();
        
        ob.check();
    }
}
