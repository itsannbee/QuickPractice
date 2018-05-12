/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

/**
 *
 * @author HP
 */
public class DutchFlagProblem {
    
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,0,1,2,2,2,0,1};
        int low = 0,mid = 0,high=arr.length-1;
        int temp;
        while (mid <=high)
        {
            switch (arr[mid])
            {        
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }           
        }
        System.out.println("Final array is");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
    
    
}
