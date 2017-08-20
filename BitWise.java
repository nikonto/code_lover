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
public class BitWise {
    public static void main(String srg[])
    {
       
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int ans;
        int temp = 0;
       
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
             for(int i =0; i<n ; i++)
            {
            for(int j = i+1; j<n ; j++)
                {
                ans = i&j;
                if(ans < k)
                    {
                    temp = ans;
                }
            }
        }
        }
       
        System.out.println(temp);
    }
    }

