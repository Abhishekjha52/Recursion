import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;

    Node(int x)
    {
        data=x;
        next=null;
    }
}
class InserValInBST {
    static void printList(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOEXception{
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();

            Node head=new Node(sc.nextInt());
            Node tail=head;

            for(int i=0;i<n-1;i++)
            {
                tail.next=new Node(sc.nextInt());
                tail=tail.next;
            }

            Solution ob=new Solution();
            head=ob.InserValInBST(head1, data);
            printList(head);
            t--;

        }
    }
}
public class Solution
{
    public Node insertNode(Node head, int data)
    {
        if(head==null)
        {
            head=new Node();
            head.data=data;
            return head;
        }

        if(head.data<data)
            head.right=insertNode(head.right,data);
        else
            head.left=insertNode(head.left,data);

        return head;
    }
}
