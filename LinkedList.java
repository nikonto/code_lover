/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Nikhil
 */
public class LinkedList {
    
   static class Node{
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
     Node head;
     public void add(int data, Node new_node)
     {
         Node p;
         p = head;
         
         new_node = new Node(data);
         
         p.next = new_node;
     }
     
     //for traversing
     
     public void traverse()
     {
         if(head.next == null)
         {
             System.out.println("Only Head");
         }
             
         else
         {
             while(head.next!=null)
             {
                 System.out.println(head.data);
             }
         }
     }
     
     
     
     
}
}
