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
public interface AdvancedArithmetic {
    public abstract int divisorsum(int n);
            
}

class MyCalculator implements  AdvancedArithmetic{
    
    Scanner sc = new Scanner(System.in);
    public int divisorsum(int n)
    {
       // n = sc.nextInt();
        int i=1 ;
        int[] arr = new int[100];
        
        while(n%i == 0)
        {
           
            i++;
             System.out.println(arr[i]);
        }
        return arr[i];
    }
    
}

class SolutionInterface
{
    public static void main(String args[]) throws Exception
    {
        int k = 6;
        MyCalculator ob = new MyCalculator();
        
        ob.divisorsum(k);
    }
}
