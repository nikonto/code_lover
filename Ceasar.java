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
public class Ceasar {
    public void encrypt(String s, int k)
    {
        int len = s.length();
        for(int i = 0;i<len;i++)
        {
            char ch = s.charAt(i);
            int c = (int)ch;
            int val = c+k;
            
            if(c>=65 && c<=90)
            {
                System.out.print((char)(((val-65)%26)+65)); 
            }
             else if(c>=97 && c<=122)
             {
               System.out.print((char)(((val-97)%26)+97)); 
             }
            else{
                System.out.print((char)c);
            }
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int key = sc.nextInt();
        Ceasar ob = new Ceasar();
        ob.encrypt(str, n);
      //  key = key%n;
        
        //char[] arr = str.toCharArray();
     
       
    }
}
