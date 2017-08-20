/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geekforgeek;

import java.util.Scanner;

/**
 *
 * @author Nikhil
 */
public class RabinKarp {
    static void eleSearch(String pat, String text, int q){
        
        char[] patt = pat.toCharArray();
        char[] textt = text.toCharArray();
        
        int i,j;
        int h=1;
        int d=256;
        int p=0; //hash value for pattern
        int t=0; //hash value for text
        int pl = patt.length;
        int tl=textt.length;
        
        //calculating hash value
        
        for(i=0;i<pl-1;i++){
            h=(h*d)%q;
        }
        
        //calculting hash value for patttern and text
        for(i=0;i<pl;i++){
            p=(d*p+patt[i])%q;
            t=(d*t+textt[i])%q;
        }
        
        for(i=0;i<tl-pl;i++){
            if(p==t){
                for(j=0;j<pl;j++){
                    if(textt[i+j]!=patt[j])
                        break;
                }
                if(j==pl)
                    System.out.println("String match at index:" + i);
            }
        }
        
        if(i<tl-pl){
            t=(d*(t-textt[i])*h)+textt[i+pl]%q;
            
            if(t<0)
                t=t+q;
        }
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cradential: ");
        String pat = sc.nextLine();
        String text = sc.nextLine();
        int q = sc.nextInt();
        eleSearch(pat, text, q);
        
        
        
    }
}
