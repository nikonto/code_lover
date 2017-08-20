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
public class TownTravelling {
    
     public static void main(String[] args) {
       
        //First of all enter the number of test cases
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        int a ;
        
        for(int i = 1;i<=tc ; i++)
            {
           //Now enter number of towns 
                a=1;
            int town = sc.nextInt();
            int routs = 0;
            //enter the routs
             for(int j = 1; j < town ; j++)
            {
             routs = sc.nextInt();
                 a = a*routs;
                  
            }
            System.out.println(a);
        }
       
    }
}
