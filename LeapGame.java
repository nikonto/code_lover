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
public class LeapGame {
  public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
         int p=0;
        while(p<game.length){
            if(p+leap==0 || p+leap>=game.length){
                p+=leap;
            }
            else if(p+leap != 0 && p+1==0){
                p++;
            }
            else if(p+1==1 && p+leap==1){
                p--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
