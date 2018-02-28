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
class Node
{
    int data;
    Node left,right;
 
    public Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}
public class LeftandRightTrav {
       int max_level;
    public void print_lefttrav(Node root,int level)
    {
        if (root == null)
            return;
        if(max_level<level)
        {    
            System.out.print(root.data+"  ");
            max_level=level;
        }
        print_lefttrav(root.left,level+1);
        print_lefttrav(root.right,level+1);
        
    }
    public void print_righttrav(Node root,int level)
    {
        if (root == null)
            return;
        if(max_level<level)
        {    
            System.out.print(root.data+"  ");
            max_level=level;
        }
        print_righttrav(root.right,level+1);
        print_righttrav(root.left,level+1);
        
    }
    public static void main(String[] args) {
        LeftandRightTrav t = new LeftandRightTrav();
        //System.out.println("Enter the numbers");
        Node tree = new Node(50);
        tree.left = new Node(40);
        tree.left.left = new Node(30);
        tree.left.left.left = new Node(20);
        tree.left.left.right = new Node(35);
        tree.left.left.right.right = new Node(37);
        System.out.println("The Left View");
        t.max_level=0;
        t.print_lefttrav(tree,1);
        System.out.println("\nThe Right View");
        t.max_level=0;
        t.print_righttrav(tree,1);
    }
}
