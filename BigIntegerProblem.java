/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class BigIntegerProblem {
    
    public static void main(String args[])
    {
//        BigInteger bi = new BigInteger("48411565451715488451621615455123262");
//        BigInteger bi1 = new BigInteger("48151525268785621145984516516268784161623327459823");
//        
//        bi = bi.multiply(bi1);
//        System.out.println(bi);
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger bi = sc.nextBigInteger();
        BigInteger bi1 = sc.nextBigInteger();
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger mul = BigInteger.valueOf(0);
        
        
//        bi = bi.add(bi1);
//        bi1 = bi1.multiply(bi);
//        System.out.println("addition is "+bi);
//        System.out.println("multiply is:"+bi1);
       // System.out.println();
        sum = sum.add(bi);
        sum = sum.add(bi1);
        mul = bi.multiply(bi1);
        System.out.println(sum);
        System.out.println(mul);
    }
}
