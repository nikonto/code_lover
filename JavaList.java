/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HakerrankPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class JavaList {
    public static void main(String args[]){
       // List<Integer,Integer> li = new ArrayList<Integer,Integer>();
        List<Integer> li = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            li.add(sc.nextInt());
        }
        
        //Enter number of queries
        int q = sc.nextInt();
       
        
        for(int i=0;i<q;i++)
        {   
             String str = sc.next();
            if(str == "Insert")
            {
                 li.add(sc.nextInt(), sc.nextInt());
            }
           else
            {
                li.remove(sc.nextInt());
            }
        }
        
//        li.add(3, 56);
        System.out.print(li);
//        
//        li.remove(4);
//        System.out.println(li);
    }
}
