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
 */
/* A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….*/
/*If we notice carefully the magic numbers can be represented as 001, 010, 011, 100, 101, 110 etc, where 001 is 0*pow(5,3) + 0*pow(5,2) + 1*pow(5,1). So basically we need to add powers of 5 for each bit set in given integer n.*/
public class MagicNumber {
    ArrayList <Integer> bin = new ArrayList<>(); 
    int num;
    public void findBinary(int num)
    {
        int binary,quo = 0,count= 0;
        
        while (num !=1)
         {
             bin.add(num % 2);
             num = num /2; 
        }
        bin.add(1);
        
    }
    public int findMagic()
    {
        int magicnum = 0;
    for (int i =0; i <bin.size();i++)
    {
        magicnum = magicnum+ bin.get(i)*power(5,(bin.size()-i));
        //System.out.println(bin.size()-i);
       // System.out.println(power(5,(bin.size()-i)));
        //System.out.println(magicnum);
    }
        return magicnum;
    }
    public int power(int num,int pow)
    {
    int numpow=1;
    if (pow == 0)
        return 1;
    else
    {
    for (int i=0;i<pow;i++)
    {
        numpow = numpow * num;
    }
    return numpow;
    }
    }
            
    public static void main(String[] args) {
        MagicNumber mn = new MagicNumber();
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        mn.num = sc.nextInt();
        mn.findBinary(mn.num);
        System.out.println(mn.findMagic());
    }
}
