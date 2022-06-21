//Binary search using recursion
import java.util.*;
import java.util.*;
public class BinSearch{
    public static int BSearch(int[] arr, int left, int right, int val)
    {
        //base case
        if(left>right)
            return -1;

        int mid=(left+right)/2;//to handle interger overflow condition
        if(arr[mid]==val)
            return mid;

        if(arr[mid]<val)
            return BSearch(arr,mid+1,right,val);
        
        return BSearch(arr,left,mid-1,val);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element to find: ");
        int target=sc.nextInt();
        int ans=BSearch(arr,0,n-1,target);
        System.out.print(ans);

        
    }
}