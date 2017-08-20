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
public class BinaryNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int[] bin = new int[100];
        int i, top, cnt, max;
        top = 0;
        while(n>=1)
        {
            
           i = n%2;
           arr[top++] = i;
           n = Math.abs(n/2);
           // System.out.println(i);
           System.out.println(i);   
        }
        
        // reverse the arr
        for(i=top-1, cnt=0; i>=0; i--, cnt++)
            bin[cnt] = arr[i];
       
        i = 0;
        max = 0;
        top = 0;
        while(i<cnt)
        {
            if(bin[i] == 0)
            {
                if(max<top)
                {
                    max = top;
                }
                top = 0;
            }
            else
                top++;
            
            i++;
        }
        if(max<top)
            max = top;
        
        
        System.out.println(max);
        
    }
}
