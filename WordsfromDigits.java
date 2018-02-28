/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amzntest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WordsfromDigits {
    HashMap<Character, ArrayList<String>> c = new HashMap <Character, ArrayList<String>>();
    ArrayList<String> output = new ArrayList<String>();
    char[] digits;
    
    public WordsfromDigits(String s)
    {
        digits = s.toCharArray();
    }
    public void fun_getString(int start_point, String upper_str)
    {
        if(start_point < digits.length)
        {
            for(int i = 0; i<c.get(digits[start_point]).size();i++)
            {
                fun_getString(start_point+1,upper_str + c.get(digits[start_point]).get(i));
            }  
        }
        else
            output.add(upper_str);
    }
    public void createMap()
    {
        c.put('2',new ArrayList<String>(){{add("a");add("b");add("c");}});
        c.put('3',new ArrayList<String>(){{add("d");add("e");add("f");}});
        c.put('4',new ArrayList<String>(){{add("g");add("h");add("i");}});
        c.put('5',new ArrayList<String>(){{add("j");add("k");add("l");}});
        c.put('6',new ArrayList<String>(){{add("m");add("n");add("o");}});
        c.put('7',new ArrayList<String>(){{add("p");add("q");add("r");add("s");}});
        c.put('8',new ArrayList<String>(){{add("t");add("u");add("v");}});
        c.put('9',new ArrayList<String>(){{add("w");add("x");add("y");add("z");}});
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordsfromDigits wd = new WordsfromDigits(sc.next());
        wd.createMap();
        //System.out.println(wd.digits.length);
        wd.fun_getString(0,"");
        for(int i = 0 ;i < wd.output.size();i++)
            System.out.println(wd.output.get(i));
    }
}

