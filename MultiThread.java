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
public class MultiThread extends Thread
{
    //choosing th option either string or number
    
    public void choose()
    {
        String n;
        
        System.out.println("String \n");
        System.out.println("Integer \n");
        System.out.println("choose the option given above \n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        
        if(n == "integer")
        {
            for(int i = 0;i<5;i++)
            {
                System.out.println("You r in integer" +i);
            }
        }
        else
        {
            String st[] = new String[20];
            for(int j = 0;j<st.length;j++)
            {
                System.out.println("You r in String" +st);
            }
            
            
        }
        
        
    }
    
    public void run()
    {
        
        choose();
    }
    
    
}

class AnsThread
{
    public static void main(String args[])
    {
        MultiThread ob = new MultiThread();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        Thread t3 = new Thread(ob);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
