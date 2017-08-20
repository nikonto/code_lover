/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vecationprectice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class Sports {
    String getName()
    {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers()
    {
//        List<Integer> li = new ArrayList<Integer>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1; i<= n ; i++)
//        {
//            li.add(i);
//            System.out.println(i);
//        }
        System.out.println("Each Team has n players in" + getName());
    }
}

class Soccer extends Sports
{
    String getName()
    {
        //System.out.println("hhvfdsf hch");
        return "Soccer Class";
    }
     void getNumberOfTeamMembers()
    {
        System.out.println("Each Team has 11 players in" + getName());
    }
}

class solution
{
    public static void main(String args[])
    {
        Sports sp = new Sports();
        Soccer sc = new Soccer();
       // sp.getName();
      System.out.println(sp.getName());
        sp.getNumberOfTeamMembers();
       // sc.getName();
         System.out.println(sc.getName());
        sc.getNumberOfTeamMembers();
        
    }
}