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
public class ConvertBinaryNumber {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int r;
        int top = 0,max=0;
        
        while(n>=1)
        {
           r = n%2;
           arr[top++] = r;
           n = Math.abs(n/2);
         // System.out.println(r);
           System.out.println(arr[top-1]);
        }
       // arr[top] = k;
        
        for(int j = 0;j<top ; j++)
        {
            if(j==0)
            {
                //j++;
            }
            else
            {
                max++;
            }
           
        }
        int con_num=0;
        int j;
         System.out.println(max);
         for (j = 0;j<top;j++)
         {
            
             if(arr[j]==0)
             {
                // break;
                 continue;
             }
             else
             {
                arr[j] = max++; 
                if(arr[j] == 0)
                {
                  continue;  
                }
             }
         }
         System.out.println(j);
    }
}
