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

public class DecimaltoBinary {
    float dec_num,decimal;
    int integral;
public void printthis()
{
System.out.println(dec_num);
System.out.println(decimal);
System.out.println(integral);
}
public void getnumbers()
{
Scanner sc = new Scanner(System.in);
dec_num = sc.nextFloat();
integral = (int)dec_num;
decimal=dec_num-integral;
}
public int forInteger()
{
    int num, binary = 0;
    num=integral;
    int i=1,rem;
    while(num > 0)
    {
        rem = num%2;
        binary = (binary) + (rem*i); 
        num=num/2;
        i=i*10;
    }
    return binary;
}
public float forFraction()
{
    float num;
    int i = 1;
    float binary=0;
    num = decimal;
    while(num != 1.0)
    {
        num = num *2;

    }
    return binary;
}
    public static void main(String[] args) {
        DecimaltoBinary a = new DecimaltoBinary();
        a.getnumbers();
        a.printthis();
        System.out.println(a.forInteger());
    }
}
