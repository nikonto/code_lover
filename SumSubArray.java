/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Nikhil
 */
public class SumSubArray {
 
   Scanner sc = new Scanner(System.in);
  
   int n;
    public void twoArray(int n) 
    {
        // n = sc.nextInt();
       //nu = n;
         this.n = n;
        int[] arr = new int[n];
       
        int i;
        for( i = 0; i<n ; i++)
        {
            arr[i]  = sc.nextInt();
          
        }
//        System.out.println("Your output is:");
//        
//        for( i = 0; i<n ; i++)
//        {
//           System.out.println(arr[i]); 
//                  
//        }
        
       }
    
    public int subarraysum()
    {
       // int n =0 ;
        twoArray(n);
        int[] arr = new int[n];
      System.out.println("Sum of Sub array");
        int msf = 0;
        int meh = 0;
        
        for( int i =0 ; i<n ; i++)
        {
            meh = meh + arr[i];
            
            if(meh < 0)
            {
                return 0;
            }
            else if(msf < meh)
            {
                 msf = meh;
            }
        }
        return msf;  
    }
     
         
        
    
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n ");
       int n = sc.nextInt();
       int m = sc.nextInt();
      
       SumSubArray ob = new SumSubArray();
       
       ob.twoArray(n);
       ob.subarraysum();
    }
}
