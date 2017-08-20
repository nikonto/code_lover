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
public class HourGlass {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int i=0;
        int j = 0;
        for( i=0; i < 2; i++){
            for( j=0; j < 2; j++){
                arr[i][j] = in.nextInt();
                
            }
        }
////        System.out.print(arr[i][j]);
        for( i=0; i < 2; i++){
            for( j=0; j < 2; j++){
                //arr[i][j] = in.nextInt();
                System.out.print(arr[i][j]);
            }
        }
    }
}
