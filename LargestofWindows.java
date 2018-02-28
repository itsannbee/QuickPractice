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
public class LargestofWindows {
    int a[] = new int[]{2,9,3,4,1,6,7};
    int k;
    public void findmax()
    {
        int i=0,j=0,max=0;
        for(i=0;i<a.length;i=i+1)
        {
            for(j=i;(j<i+k && j<a.length);j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
            }
            
            System.out.print(max+", ");
            max=0;
            if(j==a.length)
                break;
        }
    }
    public static void main(String[] args) {
        LargestofWindows lw = new LargestofWindows();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        lw.k=sc.nextInt();
        lw.findmax();
        
    }
}
