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
public class RectangleParams {
    
    Scanner sc = new Scanner(System.in);
    
    float length = sc.nextFloat();
    float width = sc.nextFloat();
    
    public void area()
    {   float area;
        
        
        area = length*width;
        System.out.println("Your area is:" + area);
        
    }
    
}


