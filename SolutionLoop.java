/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Nikhil
 */
public class SolutionLoop {
    public static void main(String args[])
    {
        int fix = 2;
         Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        System.out.println(t);
        
        for(int i=0 ; i<t ; i++)
            {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            //System.out.println(a+ "" + b+ ""+ n);
            
            for(int j = 0; j<n ; j++)
            {
                int ans = (int) (a + Math.pow(fix, j)*b);
                
                System.out.println(ans);
            }
             
            }
        
//        int n = 2;
//        int p = 4;
//        for(int i = 0; i<p ; i++)
//        {
//        int ans = (int) (Math.pow(n, i));
//        System.out.println("your answer is: " + ans);
//        }
    }
}
