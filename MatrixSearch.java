/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerrankPractice;

import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class MatrixSearch {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
       // int k=0;
        for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
                {
                mat[i][j] = sc.nextInt();
                
            }
            
        }
        
         for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
                {
               // mat[i][j] = k++;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
         
         
        //findinf count
         int count = 1;
          for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
                {
               // mat[i][j] = k++;
               if(mat[i][j]==1&&mat[i][j+1]==1)
               count++;
            }
           
        }
         
    }
}
