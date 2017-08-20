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
public class GetterSetter {
    
    int age;
    Scanner sc = new Scanner(System.in);

    public GetterSetter() {
        
        age = 15;
        System.out.println(age);
    }
    
//    public int setAge(int age)
//    {
//        this.age = age;
//       // System.out.println(age);
//        return age;
//    }
//    
//    public void getAge()
//    {
//        age = sc.nextInt();
//        setAge(age);
//    }
    
    public static void main(String args[])
    {
        GetterSetter ob = new GetterSetter();
       // ob.getAge();
    }
}
