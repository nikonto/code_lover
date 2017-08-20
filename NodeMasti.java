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
public class NodeMasti {

   NodeMasti node;
   NodeMasti next;
   int data;
   int n;
   //Program for inserting element in linked list
   
   public void insert(int d)
   {
       data = d;
       node.next = node;
       
       while(n<5)
       {
           insert(d);
       }
   }
   
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int d = sc.nextInt();
       NodeMasti ob = new NodeMasti();
       ob.insert(d);
               
   }
    
}
