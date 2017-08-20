/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class FirstThread extends Thread 
{
    String message;
//    FirstThread(String message)
//    {
//        this.message = message;
//    }
    
    public void run()
    {
//        this.message = message;
          int i = 0;
          while(i < 5)
        {
        System.out.println("Nikhil Musale");
        i++;
        yield();
        }
    }
    
}

class MyFirstThread
{
    public static void main(String args[])
    {
//        new FirstThread("Nikhil").start();
//        new FirstThread("Musale").start();
        
        FirstThread ob = new FirstThread();
        Thread t1 = new Thread(ob);
        ob.start();
//        ob.run("Nikhil");
//        ob.run("Musale");
    }
}
