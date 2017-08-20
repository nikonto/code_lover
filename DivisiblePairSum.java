/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author Nikhil
 */
public class DivisiblePairSum {
 
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        
        for(int e = 0; e< n ; e++)
        {
            a[e] = in.nextInt();
        }
        
        int i;
        int j;
        int sum;
        int count =0;
        for(i = 0; i<n ; i++)
        {
            for(j = i+1 ; j<n ; j++)
            {
                sum = a[i] + a[j];
                if(sum%k == 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
