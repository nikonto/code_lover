/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class Student {
    
//    String readBook(String read)
//    {
//        int a;
//        String red = read;
//        red = "Hello nikhil";
//        for(int i = 0;i<5;i++)
//        {
//        System.out.println("This is how you react" + red);
//        }
//        return red;
//    }
    
}

 class RockStar{
    
}

class Haker{
    
}

class InstanceSolution{
   
    public static void main(String args[])
    {
//        Student ob1;
//        RockStar ob2;
//        Haker ob3;
    ArrayList al = new ArrayList();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    int i;
//    for(i = 0 ;i<n;i++)
//    {
//       al.add(i);
//       ob = new Student();
//        //System.out.println(i);
//       ob.readBook(null);
//       ob.getClass().getCanonicalName();
//    }
   // System.out.println(("Student").getClass());
//     ob1 = new Student();
//     ob2 = new RockStar();
//     ob3 = new Haker();
//     
     for(int i = 0; i<=n ; i++)
     {
//         System.out.println(ob1);
//          System.out.println(ob2);
//           System.out.println(ob3);
//         String s1 = null;
//         String s2 = null;
//         String s3 = null;
         String s = sc.nextLine();
         if(s.equals("Student"))al.add(new Student());
         if(s.equals("RockStar"))al.add(new RockStar());
         if(s.equals("Haker"))al.add(new Haker());
         
         
     }
}
}