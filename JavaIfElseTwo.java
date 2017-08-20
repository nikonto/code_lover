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
public class JavaIfElseTwo {
    public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println(n%2==1||(6<=n&&n<=20) ? "Weird" : "Not Weird");
}
}
