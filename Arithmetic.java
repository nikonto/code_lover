/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class Arithmetic {
    
    int aa;
    int bb;
    
    public int add(int a, int b)
    {
        aa = a;
        bb = b;
        return a+b;
    }
}

class Adder extends Arithmetic
{
    void sum()
    {
        super.add(aa, bb);
    }
}

class Solution
{
    public static void main(String args[])
    {
    Adder ob = new Adder();
    
    System.out.println("my super class is: " + ob.getClass().getSuperclass().getName());
    
    System.out.println(ob.add(30, 40)+ "" + ob.add(78, 56));
    }
    
}
