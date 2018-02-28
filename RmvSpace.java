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
public class RmvSpace {
    String s  = "abc    edfg   ngfe";
    char[] l ;
    char sb[] = new char[50];
    public void strgtochar()
    {
        l=s.toCharArray();
        //System.out.println();
    }
    public void rmvwhitespace()
    {   
        
        // time complexity : O(n) space complexity : O(n)
        /*boolean flag = false;int k=0;
        for(int i = 0 ;i<l.length;i++)
        {
            if (l[i] == ' ')
            {
                flag = true;
            }
            else
            {
                if (flag == true)
                {
                    sb[k++] = ' ';
                    flag = false;
                } 
                sb[k++]=l[i];
            }
        }*/
        int i=0,k=0;
        boolean flag = false;
        for(i=0;i<l.length;i++)
        {
            if(l[i]!=' ')
            {
                l[k++]=l[i];
                flag=false;
            }
            else if (l[i]==' ' && flag==false)
            {
                l[k++]=l[i];
                flag = true;
            }

        }
        printstring(l,k);
    }
    public void printstring(char[] ca,int k)
    {
        for(int i=0;i<=k;i++)
            System.out.print(ca[i]);
    }
    public static void main(String[] args) {
        RmvSpace rs = new RmvSpace();
        rs.strgtochar();
        rs.rmvwhitespace();
        
        
    }
}
