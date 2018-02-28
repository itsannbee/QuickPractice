/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PermutationsofString {
    String input;
    char[] letters;
    ArrayList<String> output = new ArrayList<>();
    ArrayList<String> output2 = new ArrayList<>();
    public PermutationsofString(String n)
    {
        input=n;
        letters=n.toCharArray();
    }
    private void swap(int i , int j)
    {
        char temp = '@';
        //System.out.println("before swap"+new String(letters));
        temp=letters[i];
        //System.out.println(temp);
        letters[i]=letters[j];
        letters[j]=temp;
        //System.out.println(letters[j]);
       // System.out.println("after swap"+new String(letters));
    }
public void string_per(int start_pos)
{
    if(start_pos<input.length())
    for(int i = start_pos;i<input.length();i++)
    {
        swap(start_pos,i);
        output.add(new String(letters));
        string_per(start_pos+1);
        swap(i,start_pos);
    }
    else
        return;
}        
public void toHash()
{
    for (int i = 0;i<output.size();i++)
    {
        if(!output2.contains(output.get(i)))
            output2.add(output.get(i));
    }
}
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        PermutationsofString ps = new PermutationsofString(sc.nextLine());
        ps.string_per(0);
        ps.toHash();
        for(int i=0;i<ps.output2.size();i++)
            System.out.println(ps.output2.get(i));
    }
    
}
