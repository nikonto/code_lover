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
public class HakerrankMap {
    Map<String,Integer> ob = new HashMap<String, Integer>();

//    public HakerrankMap() {
//        ob = new HashMap<String, Integer>();
//    }
    
    public void addcontact(String name, int phone)
    {
        if(ob!=null && !ob.containsKey(name))
        {
            ob.put(name, phone);
        }
    }
    public String getcontact(String name)
    {
        if(ob != null && ob.containsKey(name))
        {
            return name+ "=" + ob.get(name);
        }
        else
        {
            return "Not found";
        }
    }
    public static void main(String []argh){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HakerrankMap ob1 = new HakerrankMap();
        
        for(int i = 0; i< n ; i++)
        {
            String name = sc.next();
            int phone = sc.nextInt();
            ob1.addcontact(name, phone);
        }
        
        while(sc.hasNext())
        {
            String s = sc.next();
            System.out.println(ob1.getcontact(s));
        }
    }
}

