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
/*
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words.
See following examples for more details.
Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes 
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" or "i like sam sung".
*/
public class WordBreak {
    String s;
    ArrayList<String> dictionary = new ArrayList<>();
    int t[][] = new int[50][50];
    
    public WordBreak()
    {
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        dictionary.add("ice");
        dictionary.add("icecream");
        dictionary.add("cream");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");
        dictionary.add("aaa");
        dictionary.add("aaaaaaa");
        dictionary.add("a");
        dictionary.add("aaabb");
    }
    public void createArray()
    {
        int i,j;
       for(int l=0;l<s.length();l++)
        {
            //int l=0;
            i=0;
            j=i+l;
            while(i<s.length()&&j<s.length())
            {
                
                //System.out.println("for i= "+i+" j = "+j+" substring is "+"l is  "+l+" "+ s.substring(i, j+1));
                if(dictionary.contains(s.substring(i, j+1)))
                {
                    
                    t[i][j]=1;
                }
                else
                {
                    int flag=0;
                    for(int k=i;k<j;k++)
                    {
                        if(t[i][k]==1 && t[k+1][j]==1)
                        {
                            t[i][j]=1;
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0)
                        t[i][j]=0;
                    }
                i++;
                j=i+l;
                }
            }
        }
    public void output()
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println("");
        }
        if(t[0][s.length()-1]==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        WordBreak wb = new WordBreak();
        wb.s=sc.next();
        wb.createArray();
        wb.output();
                
        
    }
}
