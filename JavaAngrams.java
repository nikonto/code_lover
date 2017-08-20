/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class JavaAngrams {
    // Scanner sc  = new Scanner(System.in);
    public String anagram(String fs, String ss)
    {
       
         
         //fs = sc.nextLine();
         char[] arr = fs.toCharArray();
        // ss = sc.nextLine();
         char[] arr1 = ss.toCharArray();
         
//         for(int i = 0;i<arr.length;i++)
//         {
//             for(int j = 0;j<arr1.length;j++)
//             {
//                 if(arr[i] == arr[j])
//                 {
//                     System.out.println("Anagrams");
//                     break;
//                 }
//                 else
//                 {
//                     System.out.println("Not anagrams");
//                 }
//             }
//         }
         Arrays.sort(arr);
         Arrays.sort(arr1);
         System.out.println(arr);
         System.out.println(arr1);
         int i =arr.length-1;
         int j = arr1.length-1;
         int flag = 0;
         
         while(i > -1 && j >-1)
         {
//             System.out.println(i);
//             System.out.println(j);
            // System.out.println(arr.length +" "+ arr1.length);
             if(arr[i] == arr1[j])
             {
             i--;
             j--;
            
             }
             else
             {
                 flag = 1;
                 
                  System.out.println("Not Anagrams");
                  break;
             }
         }
         if(flag ==0)
         {
             System.out.println("angram");
         }
        // System.out.println("Not Anagrams");
//         else
//         {
           // System.out.println("Not anagrams");
//         }
        // System.out.println("Aagrams");
         return null;
        
    }
    
    public static void main(String args[])
    {

   
   Scanner sc = new Scanner(System.in);
   String fs = sc.nextLine();
   String ss = sc.nextLine();
    
   JavaAngrams ob = new JavaAngrams();
   ob.anagram(fs, ss);
    
}
}
