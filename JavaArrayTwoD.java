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
public class JavaArrayTwoD {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int maxsum, sum;
        int arr[][]  = new int[6][6];
        for(int i = 0; i<6 ; i++)
        {
            for(int j = 0; j< 6 ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        maxsum=-2000;
       // sum=0;
        
        for(int i = 0; i< 4 ; i++)
        {
            for(int j = 0 ; j<4 ; j++)
            {
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]; 
               // int maxsum = Math.max(sum, maxsum);
                //int m_sum = Math.max(sum, m_sum);
                if(maxsum<sum)
                {
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
        
    }
}
