/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
 
public class test1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc,temp;
        ArrayList<Integer> sizeofarray = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
        tc = Integer.parseInt(br.readLine());
        if (tc > 10 || tc < 1)
        {
            System.out.println("error");
        }
        for(int i = 0;i< tc;i++)
        {
            temp = Integer.parseInt(br.readLine());
           // if temp
            
        }
    }
}
