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
 * 
 */
public class TrappingWater {
    public static int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
    public static int max(int a,int b)
    {
        if(a<b)
            return b;
        else
            return a;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for(int i = 1 ;i<n;i++)
            left[i] = max(left[i-1],arr[i]);
        
        right[n-1] = arr[n-1];
        for(int i = n-2;i>-1;i--)
            right[i] = max(right[i+1],arr[i]);
        
        int water=0;
        for(int i = 0 ;i<n;i++)
            water = water + min(left[i],right[i]) - arr[i];
        System.out.println("Water that can be held is");
        System.out.println(water);
    }
}
