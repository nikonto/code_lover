import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TryCatch {

    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0)
             
                System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}