/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikhil
 */
public class PatterSearch {
    
    static void search(String pat, String text){
        
        char[] patt = pat.toCharArray();
        char[] textt = text.toCharArray();
        
        int p = patt.length;
        int t = textt.length;
        
        for(int i=0;i<t-p;i++){
            int j;
            for( j=0;j<p;j++){
                if(textt[i+j]!=patt[j]){
                    break;
                }
            }
            if(j==p){
                System.out.println("Pattern found at :" + i);
            }
        }
        
        
        
    }
    
    public static void main(String args[]){
    //now we going to do pattern search
    //write search function
        
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter pattern and text:");
      String pat = sc.nextLine();
      String text = sc.nextLine();
        
    
        search(pat,text);
    
}
}
