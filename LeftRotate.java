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
public class LeftRotate {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i = 0 ; i<size ; i++)
        {
            arr[i] = sc.nextInt();
        }
    
         key = key%size;
        for(int i = key ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }
        for(int i =0 ; i<key ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
