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
class Stack{
    int top;
    ArrayList<Integer> number = new ArrayList<>();
    public Stack()
    {
        top = -1;
    }
    public void push(int n)
    {
        top++;
        number.add(top,n);
    }
    public int pop()
    {
        if(top == -1)
            return 9999;
        else
        {
            top--;
            return number.get(top+1);
        }
    }
    
}
public class PostFixEvaluation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of expression");
        int n = sc.nextInt();
        Stack st = new Stack();
        System.out.println("Enter expression");
        String s = sc.next();
        char[] ch = s.toCharArray();
        int num1,num2;
        for(int i =0;i<n;i++)
        {
            if (ch[i]=='*')
            {
                num1 = st.pop();
                num2 = st.pop();
                st.push(num1*num2);
            }
            else if (ch[i] == '+')
            {
                 num1 = st.pop();
                num2 = st.pop();
                st.push(num1+num2);
            }
            else if (ch[i] == '/')
            {
                 num1 = st.pop();
                num2 = st.pop();
                st.push(num1/num2);
            }
            else if (ch[i] == '-')
            {
                 num1 = st.pop();
                num2 = st.pop();
                st.push(num1-num2);
            }
            else
                st.push(Character.getNumericValue(ch[i]));
        }
        System.out.println("The final value is ");
        System.out.println(st.pop());
        
       
    }
}
