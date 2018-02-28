/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 * Rj - Rj-1 = arrSum - n * arr[n-j]
 * arrSum = sum of Rj-1
 */
public class RotateSum {
    ArrayList<Integer> num = new ArrayList<>(); 
    int size;
    public void findSum()
    {
        int sum_j=0,max_sum,max_j,sum=0;
        for(int i =0;i<size;i++)
        {
            sum=sum+num.get(i);
            sum_j=sum_j+i*num.get(i);
        }
        max_sum=sum_j;
        max_j=0;
        for (int j=1;j<=size-1;j++)
        {
            sum_j=sum_j+sum-size*(num.get(size-j));
            if(sum_j>max_sum)
            {
                max_sum=sum_j;
                max_j=j;
            }
        }
        System.out.println("The max sum is : "+max_sum);
        System.out.println("This is found after "+max_j+" rotations");
    }
    public static void main(String[] args) {
    RotateSum rs = new RotateSum();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    rs.size = sc.nextInt();
    System.out.println("Enter the array");
    for(int i =0;i<rs.size;i++)
        rs.num.add(sc.nextInt());
    rs.findSum();
    }
 
}
