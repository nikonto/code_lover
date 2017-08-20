/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeek;

import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class ArrDist {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0 ;
        int j=i+1 ;
        
        for(int l = 0; l<n ; l++)
        {
            arr[l] = sc.nextInt();
        }
        

        for(i=0,j=i+1; i<=arr.length-2 && j<=arr.length-1; i++,j++){
            if(arr[i]!=arr[j])
            {
                int tmp=0;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        
         if(arr[n]!=0){
             while(arr[i]!=arr[i+1]){
                 i++;
             }
             System.out.println("Yes");
         }
         else{
             System.out.println("No");
         }
        
    }
}
