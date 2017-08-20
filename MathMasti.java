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
public class MathMasti {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n ; i++)
        {
            for(int j =1; j<n-1; j++)
            {
            ans = n * (n-j);
             System.out.println(ans); 
            }
            //System.out.println(ans);
          //  n--;
//            ans = ans *(n-2);
//            ans = ans *(n-3);
//            ans = ans *(n-4);
           
        }
        
    }
}
