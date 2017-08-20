/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class ObjectMasti {
     
    class Person
    {
        Scanner sc = new Scanner(System.in);
        int age;
        public void personage(int age)
        {
           // this.age = age;
            System.out.println("Person's initial age:" + age);
            System.out.println("Person's age after every five years till death:");
            for(int j = 0; j<6 ; j++)
            {
                 age = age+5;
                System.out.println("Person's present age is " + age);
            }
        }
        
       public void achivement()
       {
//           int n = sc.nextInt();
//           int enter_age = sc.nextInt();
           
            Map<Integer,String> achivements = new HashMap<Integer,String>();
           achivements.put(15, "Find Non Zero Theoram");
           achivements.put(19, "give law of earth Orbit");
           achivements.put(25, "Show existance of commets");
           achivements.put(32, "Discover the Helly commet");
           achivements.put(40, "calculate the time for helly commet around sun is 72 year ");
           
           System.out.println(achivements.toString());
          
       }
       
       public void hashmap()
       {
           int n =0;
           Map<Integer,String> enterNum = new HashMap<Integer,String>();
           for(int i = 0; i<3 ; i++)
           {
            n = sc.nextInt();
           String str = sc.nextLine();
           enterNum.put(n, str);
           enterNum.put(n, str);
           enterNum.put(n, str);
            System.out.println(enterNum.get(n));
           }
           System.out.println(enterNum.toString());
           
          
       }
    }
    
    Person ob = new Person();
    
    public  void knowAge(int i)
    {
        ob.personage(i);
    }
    
    public void helly_achivement()
    {
        ob.achivement();
    }
    
    public void tryhash()
    {
        ob.hashmap();
    }
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial age");
        int i = sc.nextInt();
        ObjectMasti obone = new ObjectMasti();
        ObjectMasti obtwo = new ObjectMasti();
         ObjectMasti obthree = new ObjectMasti();
       obone.knowAge(i);
       obtwo.helly_achivement();
       obthree.tryhash();
    }
}
