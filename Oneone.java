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
public class Oneone {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        if(a0>b0 || a1>b1 || a2>b2)
            {
            System.out.println("1");
        }
        else if(a0<b0 || a1<b1 || a2<b2)
            {
            System.out.println("1");
        }
        else
        {
            System.out.println("");
        }
          
    }
    
}
