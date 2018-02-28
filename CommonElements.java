/*
The program is to print common elements of all rows of a matrix.

This program creates a binary tree out of first row and searches each elemnt of other rows in the 
binary tree. The node has a counter which counts number of rows in which the data is present.
this is mnlogn complexity.

The other approach is to sort all elements in a row in matrix and 
 */
package amzntest;

/**
 *
 * @author HP
 */
class TreeNode
{
    int data;
    int count;
    TreeNode left;
    TreeNode right;
    public TreeNode(int n)
    {
        data=n;
        count=1;
        left=null;
        right=null;
    }
}
public class CommonElements {
    int mat[][] = {{2,3,8},{3,3,3},{8,3,2},{6,8,3},{3,8,9}};
    TreeNode t;
    public void createTree()
    {
        t = new TreeNode(2);
        t.right=new TreeNode(3);
        t.right.right = new TreeNode(8);
    }
    public void search(TreeNode root,int n,int row)
    {
        while(root !=null)
        {
            if(n==root.data && row>=root.count)
            {
                root.count++;
                break;
            }
            else if(n>root.data)
                root=root.right;
            else
                root=root.left;
                      
        }
    }
    public void findCommon()
    {
        for(int i=1;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                search(t,mat[i][j],i);
            }
        }
    }
    public void printCommons()
    {
        System.out.println("data is "+t.data+" count is "+t.count);
        System.out.println(t.right.data+"  "+t.right.count);
        System.out.println(t.right.right.data+"  "+t.right.right.count);
    }
    public static void main(String[] args) {
        CommonElements ce = new CommonElements();
        ce.createTree();
        ce.findCommon();
        ce.printCommons();
    }
}
