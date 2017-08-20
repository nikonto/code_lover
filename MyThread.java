/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
public class MyThread extends Thread{
    int count;

    public MyThread() 
    {
        count=0;
    }
    public void run()
    {    
        
        System.out.println("Thread is start:");
        
      try{
          do{
      Thread.sleep(5000);
      System.out.println("In my Thread, count is:"+count);
      count++;
      Thread.yield();
      }
          while(count<5);
          }
      catch(Exception e)
      {
          System.out.println("Main thread is inturrepted");
      }     
    }   
      
}

class Main
{
    public static void main(String args[])
    {
        MyThread ob = new MyThread();
        
       // ob.start();
        ob.run();
       // System.out.println(ob);
        do 
       { 
         System.out.println("In main thread."); 
         try 
         { 
           Thread.sleep(250); 
         } 
         catch (InterruptedException exc) 
         { 
         System.out.println("Main thread interrupted."); 
         } 
       } while (ob.count != 5); 
       System.out.println("Main thread ending."); 
     } 
    }

