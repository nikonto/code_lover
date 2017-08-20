/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//when do we use default key word?
package vecationprectice;

import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement.DEFAULT;

/**
 *
 * @author Nikhil
 */
public class Matrix
{
    int raw;
    int coloumn;
     Scanner sc = new Scanner(System.in);
    Matrix(int r, int c)
    {
      int[][] mat = new int[3][3];
      int i ,j,k=0;
      
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              
              mat[i][j]=k++;
              System.out.print( mat[i][j] +" " );
             
          }
           System.out.println();
      }
      
    }
    
    public void setElement(int x,int y)
    {  
         raw = x;
         coloumn =y;
        
        int[][] mat = new int[x][y];
        int k =0;
       
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
               
                mat[i][j] = sc.nextInt();
                mat[i][j] = k++;
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}

class MatrixOperations
{
    public static void main(String args[])
    {
        int r, c, x, y;
        r=10;
        c=10;
        x = 3;
        y = 3;
        Matrix ob = new Matrix(r, c);
        System.out.println("------other matrix------");
        ob.setElement(x,y);
    }
}
