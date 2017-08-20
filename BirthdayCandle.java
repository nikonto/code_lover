/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerrankPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandle {

    static int birthdayCakeCandles(int n, int[] ar) throws ArrayIndexOutOfBoundsException {
        // Complete this function
             int max=0;
         for(int i=0;i<n;i++)
       {
           
           for(int j=i+1;j<n;j++)
           {
               if(ar[i]<ar[j])
               {
                   max = ar[j];
               }
               else
               {
                   max = ar[i];
               }
           }
       }
         int count = 1;
         int  i=0;
         while(i<ar.length)
         {
             
             if(ar[i]==max)
             {
                 count++;
             }
             i++;
         }
         return count;
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
