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
public class SpiralMatrix {
    public int rows,columns;
    public int[][] num = new int[50][50];
    public void printMatrix()
    {
       for(int i = 0;i<rows;i++)
       {    for(int j=0;j<columns;j++)
               System.out.print(num[i][j]+"   ");
            
            System.out.println("");   
       }    
    }
    public void printSpiral()
    {
        int i1=0,j1=0,j2=columns-1,i2=rows-1;
        int i,j;
        while(i1<=i2 && j1 <= j2)
        {
            for(j=j1;j<=j2;j++)
                System.out.print(num[i1][j]+"   ");
            i1++;
            for(i=i1;i<=i2;i++)
                System.out.print(num[i][j2]+"   ");
            j2--;
            for(j=j2;j>=j1;j--)
                System.out.print(num[i2][j]+"   ");
            i2--;
            for(i=i2;i>=i1;i--)
                System.out.print(num[i][j1]+"   ");
            j1++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpiralMatrix sm = new SpiralMatrix();
        System.out.println("Enter the no of rows");
        sm.rows=sc.nextInt();
        System.out.println("Enter the no of columns");
        sm.columns=sc.nextInt();
        System.out.println("Enter the array");
        for(int i = 0;i<sm.rows;i++)
            for(int j=0;j<sm.columns;j++)
                sm.num[i][j] = sc.nextInt();
        System.out.println("The matrix is");
        sm.printMatrix();
        System.out.println("The spiral is");
        sm.printSpiral();
        
    }
}
