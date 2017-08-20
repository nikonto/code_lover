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
public class JavaArrayOneD {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
       // int i;
        for( int i = 0;i<n;i++)
        {
           // int val = sc.nextInt();
           // System.out.println(a[i]);
            a[i] = sc.nextInt();
            
        }
        //System.out.println(a[i]);
        
        sc.close();
        
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
