//program for merge sort using recursion
import java.util.*;
import java.io.*;
public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end)
    {
        //creates temp array to store the value without modifying actual contents of an array
        int temp[]=new int[end-start+1];

        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end)
        {
            if(arr[i]<=arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }

        //case where right array becomes empty and left array is still values
        while(i<=mid)
            temp[k++]=arr[i++];
        
        //case where left array becomes empty and right array has values
        while(j<=end)
            temp[k++]=arr[j++];

        //copy values from temp array to original array
        for(i=start;i<=end;i++)
        {
            arr[i]=temp[i-start];
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        mergeSort(arr,0,n-1);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    
}
