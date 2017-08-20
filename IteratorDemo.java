/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;
import java.util.*;

/**
 *
 * @author Nikhil
 */
public class IteratorDemo {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList al = new ArrayList();
        
        int n = sc.nextInt();
        sc.nextLine();
        String s = "go to hell";
        
        
//        for(int i = 0; i<n;i++)
//        {
//            al.add(i);
//           // int j = sc.nextInt();
//           
//        }
        al.add("nikhil");
        al.add("musale");
        al.add("nirma university");
        al.add("ahmedabad");
        al.add("15mcen13");
        al.add(s);
       
        System.out.println("from now iterator starts");
        Iterator it = al.iterator();
        
        while(it.hasNext())
        {
            Object element = it.next();
             System.out.println(element + "");
             
        }
         System.out.println();
    }
}
