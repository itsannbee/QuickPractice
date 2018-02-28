/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*remove spaces: the program is solved by moving characters but can also be solved by following algo;

1) Initialize 'count' = 0 (Count of non-space character seen so far)
2) Iterate through all characters of given string, do following
     a) If current character is non-space, then put this character
        at index 'count' and increment 'count'
3) Finally, put '\0' at index 'count'

*/
package amzntest;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RemoveSpace {
 int p,q;
 String s;
 public void removespace()
 {
     int p=0,q=0;
     char temp;
     char[] s_c = s.toCharArray();
     while(p<s.length() && q<s.length())
     {
         System.out.println("in main while, p is "+p+" q is "+q);
         if(s_c[p]!=' ')
            p++;
         else
         {   System.out.println(s_c[5]+"q5 value");
             if(q<p)
                q=p;
             System.out.println(s_c[q]+"q value");
            while(q<s.length())
            {   if(s_c[q]==' ')
                    q++;
                else
                    break;
            }
            if(q!=s.length())
            {
                temp=s_c[q];
                s_c[p]=temp;
                s_c[q]=' ';
                p++;
            }
         }
         //System.out.println("The part of string is   "+new String(s_c));
     }
     if(q==0)
         System.out.println("there are no white spaces");
     System.out.println("The new string is   "+new String(s_c));
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        RemoveSpace rs = new RemoveSpace();
        rs.s=sc.nextLine();
        rs.removespace();
        
    }
}
