public class PrintLeafNodes {
    public static void printAllLeafNodes(Node root)
    {
        if(root==null)return;

        if(root.left==null && root.right==null)
        {
            System.out.print(root.val+" ");
            return;
        }

        if(root.left!=null)
            printAllLeafNodes(root.left);
        if(root.right!=null)
            printAllLeafNodes(root.right);
    }
}
