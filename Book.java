/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

/**
 *
 * @author Nikhil
 */
//look example of getter and setter method
//public class Book 
//{
//    public double price;
//    public String title;
//    public String getTitle()
//    {
//        
//      return title;  
//    }
//    
//    public void setTitle(String t)
//    {
//        title = t;
//        System.out.println(title);
//    }
//    
//    public double getPrice()
//    {
//        return price;
//    }
//    
//    public void setPrice(double p)
//    {
//        System.out.println(price);
//        price = p;
//    }
//    
//}
//
//class BookDetails
//{
//    public static void main(String args[])
//    {
//        String s;
//        double p;
//        s = "nikhil";
//        p = 236.12;
//        Book ob = new Book();
//        ob.getTitle();
//        ob.setTitle(s);
//        ob.setPrice(p);
//    }
//}
import java.math.BigInteger;
import java.util.*;
abstract class Book
{
   String title;
   abstract void setTitle(String s);
   String getTitle()
   {
      return title;
   }
   
}

//Write MyBook class here

class MyBook extends Book
{
    
    void setTitle(String s)
    {
        
        s = "A tale of two cities";
        title = s;
        //System.out.println(s);
    }
}

 class Main1
{
   
   public static void main(String []args)
   {
      //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      MyBook new_novel=new MyBook();
      new_novel.setTitle(title);
      System.out.println("The title is: "+new_novel.getTitle());
      
   }
}
