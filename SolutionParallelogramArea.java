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
public class SolutionParallelogramArea {
    
    
//  static  Scanner sc = new Scanner(System.in);
//    static int b = sc.nextInt();
//   static int h = sc.nextInt();
//    static int area;
//    static
//    {
//        if(b>0 && h>0)
//        {
//       area = b*h;
//       System.out.println(area);
//        }
//        else
//        {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
//    }
    
    static int b,h;
    static boolean flag;
    
    static
    {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        
        if(b>0 && h>0)
        {
            flag = true;
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
            
    
    public static void main(String args[])
    {
        
       SolutionParallelogramArea ob = new SolutionParallelogramArea();
    }
}
