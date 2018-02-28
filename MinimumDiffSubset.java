/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MinimumDiffSubset {
  static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        HashMap<Integer, Integer> type_count = new HashMap<>();
        int max_count = 0;
        int max_type = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(type_count.containsKey(ar[i]))
            {
                type_count.replace(ar[i],type_count.get(ar[i])+1);
            }
            else
                type_count.put(ar[i],1);
        }
        for(Entry<Integer,Integer> entry : type_count.entrySet())
        {
            if (entry.getValue() > max_count)
            {    
                max_count = entry.getValue();
                max_type = entry.getKey();
            }
            else if (entry.getValue() == max_count)
            {
                if(entry.getKey() < max_type)
                    max_type = entry.getKey();
            }
            
        }
        return max_type;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}