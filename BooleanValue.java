/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class BooleanValue {
    public static void main(String args[])
    {
        Boolean obj = new Boolean("true");
         Boolean objj = new Boolean("ohhh this is false");
        Integer ob1 = new Integer(32);
       
        
        
        boolean b = obj.booleanValue();
        boolean bb = objj.booleanValue();
        int i = ob1.intValue();
        
        System.out.println(b);
         System.out.println(bb);
          System.out.println(i);
    }
}
