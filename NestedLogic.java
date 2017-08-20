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
public class NestedLogic {
    
    public int nes(int Da,int De, int Ma, int Me, int Ya,int Ye)
    {
        int fine;
         if(Da<1 && Da>31 || De<1 && De>31)
            {
            return 0;
        }
        if(Ma<1 && Ma>12 || Me<1 && Me>12)
            {
            return 0;
        }
         if(Ya<1 && Ya>3000 || Ye<1 && Ye>3000)
            {
            return 0;
        }
     
        if(Da>De && Ma==Me && Ya==Ye )
            {
            fine = 15 * (Da-De);
            //System.out.print(fine);
            return fine;
        }
        else if(Da==De && Ma>Me && Ya==Ye)
            {
            fine = 500 * (Ma-Me);
            //System.out.print(fine);
            return fine;
        }
        else
            {
            fine =  10000;
            //System.out.print(fine);
            return fine;
        }
    }
    
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          int Da,De;
        int Ma,Me;
        int Ya,Ye;
        int fine;
        Scanner sc = new Scanner(System.in);
        Da = sc.nextInt();
        Ma = sc.nextInt();
        Ya = sc.nextInt();
        De = sc.nextInt();
        Me = sc.nextInt();
        Ye = sc.nextInt();
//       System.out.println(Da+" "+Ma+" "+Ya);
//       System.out.println(De+" "+Me+" "+Ye);
//        if(Da>De && Ma==Me && Ya==Ye )
//            {
//            fine = 15 * (Da-De);
//            System.out.print(fine);
//        }
        NestedLogic ob = new NestedLogic();
        ob.nes(Da, De, Ma, Me, Ya, Ye);
        
    }
    
}
