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
public class LeftRotation {
//    public void leftRotation(int arr[], int d , int n)
//    {
//        for(int i = 0;i<d ; i++)
//        {
//            leftRotatioByOne(arr, n);
//        }
//       /// printArray(arr, n);
//    }
//    public void leftRotatioByOne(int arr[], int n)
//    {
//        int i , temp;
//        temp = arr[0];
//        for(i = 0; i<n-1 ; i++)
//        {
//            arr[i] = arr[i+1];
//            arr[i] = temp;
//        }
//    }
//    public void printArray(int arr[], int n)
//    {
//        for(int i = 0; i<n ; i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//    public static void main(String args[])
//    {
//       Scanner sc = new Scanner(System.in);
//       LeftRotation ob = new LeftRotation();
//         int n = sc.nextInt();
//         int key = sc.nextInt();
//         int[] arr = new int[n];
//       ///  int i;
//         for(int i = 0; i<n ; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//       //  System.out.println(arr);
//         ob.leftRotation(arr, key, n);
//         ob.printArray(arr, n);
////         int temp;
////         int first = arr[0];
////         int last = arr.length;
//         //arr[0] = first;
////       for( i = 0; i<key ; i++)
////       {
////           temp = first;
////           first = arr[first+1];
////           last = temp;
////       }
////         while(key<=0)
////         {
////           temp = first;
////           first = arr[first+1];
////           last = temp;  
////           key--;
////         }
////       int first = key;
////       for(i = 0; i<n ; i++)
////       {
////          arr[i] = arr[first];
////         //  first = arr[i];
////       }
//          
//       //System.out.println("roteted array is :" + arr[i]);
//    }
    static void name()
    {
        System.out.println("nikhil");
    }
    public static void main(String args[])
    {
        name();
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,4,9,8,7};
        int key = sc.nextInt();
       int i;
        //while(key<=0)
        for(i = 0; i<key ; i++)
        {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = arr[3];
            arr[3] = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;
        }
        System.out.println("left rotate array is" + arr[i]);
    }
    
}
