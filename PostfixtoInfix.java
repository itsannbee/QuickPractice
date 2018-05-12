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
class PostStack{
int top;
ArrayList<String> stack = new ArrayList<>();
public PostStack()
{
    top = -1;
}
public void push(String s)
{
    top++;
    stack.add(top, s);
}
public String pop()
{
    top--;
    return stack.get(top+1);
}
}

public class PostfixtoInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix string");
        String post = sc.nextLine();
        char[] exp = post.toCharArray();
        PostStack ps = new PostStack();
        for(int i=0;i<exp.length;i++)
        {
            if (exp[i]>='a' && exp[i]<='z')
                ps.push(Character.toString(exp[i]));
            else
            {
                String pop1 = ps.pop();
                String pop2 = ps.pop();
                ps.push("("+pop2+Character.toString(exp[i])+pop1+")");
            }
        }
        System.out.println("The infix expression is");
        System.out.println(ps.pop());
    }
}
