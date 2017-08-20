/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class LinkedMasti {
    
   static class LinkedOne
   {
       int var1;
       LinkedOne()
       {
           
       }
   }
   LinkedOne object_one;
   
   static class LinkedTwo
   {
       int nar2;
       LinkedTwo()
       {
           
       }
   }
   LinkedTwo object_two;
   
   class LinkedThree
   {

        public LinkedThree() {
        }
       
   }
   LinkedThree object_three;
   
   public static void main(String args[])
   {
       LinkedMasti lm = new LinkedMasti();
       lm.object_one.var1 = 10;
   }
}
