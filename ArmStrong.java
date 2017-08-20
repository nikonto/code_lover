/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class ArmStrong {
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException
    {
        int num = Integer.parseInt(args[0]);
        int n=num;
        int check=0;
        int reminder;
        try{
        while(num>0)
        {
            reminder=num%10;
            check = check+(int)Math.pow(reminder, 3);
            num = num/10;
        }
        }
        catch(Exception e)
        {
            System.out.println();
        }
        if(check==n)
        {
            System.out.println(n+ "armstrong number");
        }
        else
         {
            System.out.println(n+ "not armstrong number");
        }            
    }
}
