/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DiagonalMatrix {
   int arr[][]= new int[50][50];
   int row,col;
   public void getarray()
   {
       
       Scanner sc = new Scanner (System.in);
       System.out.println("enter number of rows and column");
       row=sc.nextInt();
       col=sc.nextInt();
       System.out.println("enter the array");
       for (int i1=0;i1<row;i1++)
           for (int j1=0;j1<col;j1++)
               arr[i1][j1]=sc.nextInt();
   }
   public void printdiagonal()
   {
       int x,y;
       for(int i =0;i<row;i++)
       {
           x=i;
           y=0;
           while(x>-1 && y<col)
           {
               System.out.print(arr[x--][y++]+"  ");
           }
           System.out.println("");
       }
       for (int j=0;j<col;j++)
       {
           x=row-1;
           y=j+1;
           while(x>-1 && y<col)
           {
               System.out.print(arr[x--][y++]+"  ");
           }
           System.out.println("");
       }
   }
    public static void main(String[] args) {
            DiagonalMatrix dm = new DiagonalMatrix();
            dm.getarray();
            dm.printdiagonal();
    }
}
