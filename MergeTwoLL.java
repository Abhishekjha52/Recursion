//Java program to merge two sorted linked list using recursion
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
class MergeTwoLL {
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
            head=ob.MergeTwoLL(head1, head2);
            printList(head);
            t--;

        }
    }
}
public class Solution {
    public Node MergeTwoLL(Node A, Node B)
    {
        //base case
        if(A==null)return B;
        if(B==null)return A;

        if(A.data<B.data)
        {
            A.next=MergeTwoLL(A.next, B);
            return A;
        }
        else
        {
            B.next=MergeTwoLL(A, B.next);
            return B;
        }
    }
    
}
