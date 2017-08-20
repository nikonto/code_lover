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
public class HTestOne {
  
    public int maxEle(int[] arr)
    {
        //int ans = 0;
        int[] ans = new int[arr.length];
        int i =0;
        for( i =0;i<arr.length ; i++)
        {
            for(int j = 1; j<arr.length;j++)
            {
                ans[i] = arr[i] + arr[j];
            }
           // return ans;
        }
        return ans[i];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HTestOne ob = new HTestOne();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
                    
        }
        
        ob.maxEle(arr);
       
        
        
    }
    
}
