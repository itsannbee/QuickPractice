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
public class ElementinSortedArray {
    int[][] a=new int[][]{ {10, 20, 30, 40}, 
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};
    int k;
    public void findElement()
    {
        int flag=0,i=0,j=a[0].length-1;
        while((i>-1&&i< a[0].length) && j>-1&& j<a[0].length)
        {
            if(k>a[i][j])
                i++;
            else if(k==a[i][j])
            {    
                System.out.println("found at "+(i+1)+", "+(j+1));
                flag=1;
                break;
            }
            else
                j--;
        }
        if (flag==0)
            System.out.println("Not found");
        
    }
    public static void main(String[] args) {
        ElementinSortedArray e = new ElementinSortedArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to be searched");
        e.k=sc.nextInt();
        e.findElement();
    }
}
